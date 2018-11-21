package us.coastalhacking.corvus.emf.provider;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain.Registry;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

import us.coastalhacking.corvus.emf.EmfApi;
import us.coastalhacking.corvus.emf.ResourceInitializer;
import us.coastalhacking.corvus.emf.TransactionIdUtil;

@Component(service = IEditingDomainProvider.class, configurationPid = EmfApi.IEditingDomainProvider.Component.CONFIG_PID, configurationPolicy = ConfigurationPolicy.REQUIRE)
public class TransactionalEditingDomainProvider implements IEditingDomainProvider {

	AtomicBoolean activated = new AtomicBoolean(false);
	AtomicBoolean deactivated = new AtomicBoolean(false);
	final List<ResourceSetListener> listeners = new CopyOnWriteArrayList<>();
	final List<ResourceInitializer> initializers = new CopyOnWriteArrayList<>();
	TransactionalEditingDomain editingDomain;
	String transactionId;
	URI projectUri;

	@Reference
	TransactionIdUtil transactionIdUtil;

	@Reference(name = EmfApi.Registry.Reference.NAME)
	Registry registry;

	@Reference(name = EmfApi.IEditingDomainProvider.Reference.RESOURCE_SET_LISTENERS, cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY)
	void setResourceSetListeners(ResourceSetListener listener) throws Exception {
		if (activated.get()) {
			editingDomain.addResourceSetListener(listener);
		} else {
			listeners.add(listener);
		}
	}

	void unsetResourceSetListeners(ResourceSetListener listener) {
		if (activated.get()) {
			editingDomain.removeResourceSetListener(listener);
		} else {
			listeners.remove(listener);
		}
	}

	@Reference(name = EmfApi.IEditingDomainProvider.Reference.INITIALIZERS, cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY)
	void setInitializer(ResourceInitializer initializer) {
		if (activated.get()) {
			initializeResource(initializer);
		} else {
			initializers.add(initializer);
		}
	}

	void unsetInitializer(ResourceInitializer initializer) {
		if (!activated.get()) {
			initializers.remove(initializer);
		}
	}

	void initializeResource(ResourceInitializer initializer) {
		final URI logical = URI.createURI(initializer.getLogical());
		final URI physical = projectUri.appendSegment(initializer.getPhysical());
		Command command = new InitializingCommand(getEditingDomain(), logical, physical, initializer.getRoot());
		getEditingDomain().getCommandStack().execute(command);
	}

	@Activate
	void activate(Map<String, Object> props) {
		transactionId = transactionIdUtil.getId(props);
		projectUri = transactionIdUtil.getUri(transactionId);

		editingDomain = registry.getEditingDomain(transactionId);
		activated.set(true);
		for (ResourceSetListener listener : listeners) {
			editingDomain.addResourceSetListener(listener);
		}
		listeners.clear();
		for (ResourceInitializer initializer : initializers) {
			initializeResource(initializer);
		}
		initializers.clear();
	}

	@Deactivate
	void deactivate() {
		if (deactivated.getAndSet(true)) {
			return;
		}
		registry.remove(transactionId);
		editingDomain.dispose();
	}

	@Override
	public TransactionalEditingDomain getEditingDomain() {
		return editingDomain;
	}
}
