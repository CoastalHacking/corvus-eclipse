package us.coastalhacking.corvus.eclipse.transaction.provider;

import org.eclipse.emf.transaction.TransactionalEditingDomain.Registry;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import us.coastalhacking.corvus.eclipse.transaction.TransactionalRegistrar;

@Component(scope=ServiceScope.SINGLETON, service=TransactionalRegistrar.class)
public class TransactionalRegistrarProvider implements TransactionalRegistrar {

	@Override
	public WorkspaceEditingDomainFactory workspaceFactory() {
		return WorkspaceEditingDomainFactory.INSTANCE;
	}

	@Override
	public Registry transactionalRegistry() {
		return Registry.INSTANCE;
	}

}
