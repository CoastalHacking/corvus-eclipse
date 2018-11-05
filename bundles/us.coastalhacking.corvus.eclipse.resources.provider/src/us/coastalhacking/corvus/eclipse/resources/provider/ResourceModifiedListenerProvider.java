package us.coastalhacking.corvus.eclipse.resources.provider;

import java.util.Map;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesApi;
import us.coastalhacking.corvus.eclipse.resources.ResourceModifiedListener;
import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalRegistry;

@Component(service=ResourceModifiedListener.class, configurationPid=EclipseResourcesApi.ResourceModifiedListener.Component.CONFIG_PID, configurationPolicy=ConfigurationPolicy.REQUIRE, immediate=true)
public class ResourceModifiedListenerProvider extends ResourceModifiedListenerBase {

	private String transId;
	private TransactionalEditingDomain domain;

	@Reference
	IWorkspace workspace;

	@Reference(name=EclipseResourcesApi.ResourceModifiedListener.Reference.REGISTRY)
	CorvusTransactionalRegistry registry;

	@Activate
	void activate(Map<String, Object> props) {
		transId = (String)props.get(EclipseResourcesApi.TransactionalEditingDomain.Properties.ID);
		domain = registry.getEditingDomain(transId);
		domain.addResourceSetListener(this);
	}
	
	@Deactivate
	void deactivate() {
		domain.removeResourceSetListener(this);
	}
	
	@Override
	protected IWorkspace getWorkspace() {
		return workspace;
	}
	
	@Override
	protected TransactionalEditingDomain getDomain() {
		return domain;
	}
}
