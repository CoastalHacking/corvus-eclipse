package us.coastalhacking.corvus.eclipse.transaction.provider;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;

import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalFactory;
import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalRegistry;
import us.coastalhacking.corvus.eclipse.transaction.EclipseTransactionApi;

@Component(service=CorvusTransactionalRegistry.class, configurationPid=EclipseTransactionApi.CorvusTransactionalRegistry.Component.CONFIG_PID, configurationPolicy=ConfigurationPolicy.REQUIRE)
public class CorvusTransactionalRegistryProvider implements CorvusTransactionalRegistry {

	final Map<String, TransactionalEditingDomain> registries = new ConcurrentHashMap<>();
	
	@Reference(name=EclipseTransactionApi.CorvusTransactionalRegistry.Reference.FACTORY)
	CorvusTransactionalFactory factory;
	
	@Override
	public TransactionalEditingDomain getEditingDomain(String id) {
		if (registries.containsKey(id)) {
			return registries.get(id);
		}
		TransactionalEditingDomain domain = factory.createEditingDomain();
		add(id, domain);
		return domain;	
	}

	@Override
	public void add(String id, TransactionalEditingDomain domain) {
		registries.put(id, domain);
	}

	@Override
	public TransactionalEditingDomain remove(String id) {
		return registries.remove(id);
	}

}
