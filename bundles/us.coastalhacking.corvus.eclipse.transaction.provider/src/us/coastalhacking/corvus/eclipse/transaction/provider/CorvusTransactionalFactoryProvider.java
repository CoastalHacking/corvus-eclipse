package us.coastalhacking.corvus.eclipse.transaction.provider;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl.FactoryImpl;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;

import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalFactory;
import us.coastalhacking.corvus.eclipse.transaction.EclipseTransactionApi;
import us.coastalhacking.corvus.eclipse.transaction.InitializingCommand;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;

@Component(service = CorvusTransactionalFactory.class, configurationPid = EclipseTransactionApi.CorvusTransactionalFactory.Component.CONFIG_PID, configurationPolicy = ConfigurationPolicy.REQUIRE)
public class CorvusTransactionalFactoryProvider extends FactoryImpl implements CorvusTransactionalFactory {

	@Reference(name = EclipseTransactionApi.CorvusTransactionalFactory.Reference.INITIALIZERS)
	List<ResourceInitializer> initializers;

	Map<String, Object> props;

	@Activate
	void activate(Map<String, Object> props) {
		this.props = props;
	}

	@Override
	public synchronized TransactionalEditingDomain createEditingDomain() {
		TransactionalEditingDomain domain = super.createEditingDomain();

		for (ResourceInitializer ri : initializers) {
			final String uriValue = (String) props.get(ri.getUriKey());
			final URI key = URI.createURI(uriValue);
			final String pathValue = (String) props.get(ri.getPathKey());
			final URI value = URI.createFileURI(pathValue);

			Command command = new InitializingCommand(domain, key, value, ri.getRoot());
			domain.getCommandStack().execute(command);
		}

		return domain;
	}
}
