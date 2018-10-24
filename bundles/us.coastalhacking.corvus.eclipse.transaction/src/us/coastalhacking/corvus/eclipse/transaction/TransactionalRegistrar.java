package us.coastalhacking.corvus.eclipse.transaction;

import org.eclipse.emf.transaction.TransactionalEditingDomain.Registry;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;

@Deprecated
public interface TransactionalRegistrar {

	WorkspaceEditingDomainFactory workspaceFactory();
	
	Registry transactionalRegistry();
}
