package us.coastalhacking.corvus.eclipse.transaction.provider;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;

import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalFactory;
import us.coastalhacking.corvus.eclipse.transaction.EclipseTransactionApi;
import us.coastalhacking.corvus.eclipse.transaction.InitializingCommand;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;

@Component(service = CorvusTransactionalFactory.class, configurationPid = EclipseTransactionApi.CorvusTransactionalFactory.Component.CONFIG_PID, configurationPolicy = ConfigurationPolicy.REQUIRE, immediate=true)
public class CorvusTransactionalFactoryProvider extends WorkspaceEditingDomainFactory implements CorvusTransactionalFactory {

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
			final URI logical = ri.getLogical();
			final URI physical = ri.getPhysical();

			Command command = new InitializingCommand(domain, logical, physical, ri.getRoot());
			domain.getCommandStack().execute(command);
		}

		return domain;
	}
}
