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
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesChangeListener;
import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalRegistry;

@Component(service=EclipseResourcesChangeListener.class, configurationPid=EclipseResourcesApi.EclipseResourcesChangeListener.Component.CONFIG_PID, configurationPolicy=ConfigurationPolicy.REQUIRE)
public class EclipseResourcesChangeListenerProvider extends EclipseResourcesChangeListenerBase {

	@Reference
	IWorkspace workspace;

	@Reference(name=EclipseResourcesApi.EclipseResourcesChangeListener.Reference.REGISTRY)
	CorvusTransactionalRegistry registry;
	
	@Activate
	void activate(Map<String, Object> props) {
		String markerType = (String) props.get(EclipseResourcesApi.EclipseResourcesChangeListener.Properties.MARKER_TYPE);
		String transactionId = (String) props.get(EclipseResourcesApi.TransactionalEditingDomain.Properties.ID);
		String uriKey = (String) props.get(EclipseResourcesApi.EclipseResourcesInitializer.Properties.URI_KEY);
		TransactionalEditingDomain domain = registry.getEditingDomain(transactionId);
		super.baseActivate(markerType, domain, uriKey);		
		workspace.addResourceChangeListener(this);
	}
	
	@Deactivate
	void deactivate() {
		workspace.removeResourceChangeListener(this);
	}
}
