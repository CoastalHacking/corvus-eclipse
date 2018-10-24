package us.coastalhacking.corvus.eclipse.launcher.provider;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import us.coastalhacking.corvus.eclipse.launcher.EclipseLauncherApi;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;
import us.coastalhacking.corvus.eclipse.transaction.TransactionalRegistrar;

@Component(factory = EclipseLauncherApi.Component.CORVUS_LAUNCHER_FACTORY)
public class CorvusLauncherProvider extends CorvusLauncherBase {

	@Reference
	Collection<ResourceInitializer> initializers;

	@Reference
	TransactionalRegistrar registrar;
	
//	@Reference
//	IWorkspace workspace;
//	
//	@Reference(target="(corvus.domain=org.eclipse.core.resources)")
//	IResourceChangeListener changeListener;

	@Activate
	void activate(Map<String, ?> props) throws Exception {
		super.baseActivate(props);
	}

	@Deactivate
	void deactivate(Map<String, ?> props) {
		super.baseDeactivate(props);
	}

	@Override
	protected Collection<ResourceInitializer> getInitializers() {
		return initializers;
	}

	@Override
	protected TransactionalEditingDomain.Registry getDomainRegistry() {
		return registrar.transactionalRegistry();
	}

	@Override
	protected WorkspaceEditingDomainFactory getDomainFactory() {
		return registrar.workspaceFactory();
	}

//	@Override
//	protected IWorkspace getWorkspace() {
//		return workspace;
//	}
//
//	@Override
//	protected IResourceChangeListener getChangeListener() {
//		return changeListener;
//	}

}
