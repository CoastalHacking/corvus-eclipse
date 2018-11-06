package us.coastalhacking.corvus.eclipse.resources.provider;

import org.eclipse.core.resources.IWorkspace;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesApi;
import us.coastalhacking.corvus.eclipse.resources.MarkerProvider;
import us.coastalhacking.corvus.eclipse.resources.MarkerSupport;

@Component(service = MarkerSupport.class, configurationPid = EclipseResourcesApi.MarkerSupport.Component.CONFIG_PID, immediate=true)
public class MarkerSupportProvider extends MarkerSupportBase {

	@Reference
	IWorkspace workspace;

	@Reference(name=EclipseResourcesApi.MarkerSupport.Reference.MARKER_PROVIDER, cardinality=ReferenceCardinality.OPTIONAL, policy=ReferencePolicy.DYNAMIC, policyOption=ReferencePolicyOption.GREEDY)
	void setMarkerProvider(MarkerProvider provider) {
		super.addMarkerProvider(provider);
	}
	void unsetMarkerProvider(MarkerProvider provider) {
		super.removeMarkerProvider(provider);
	}

	@Activate
	void activate(BundleContext bundleContext) {
		this.id = bundleContext.getBundle().getSymbolicName();
	}

	@Deactivate
	protected void deactivate() {
		this.id = null;
	}

	@Override
	protected IWorkspace getWorkspace() {
		return workspace;
	}

}
