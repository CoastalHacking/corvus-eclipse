package us.coastalhacking.corvus.eclipse.resources.provider;

import org.eclipse.core.resources.IWorkspace;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import us.coastalhacking.corvus.eclipse.resources.MarkerSupport;

@Component(configurationPid = "us.coastalhacking.corvus.eclipse.ui.MarkerSupport", configurationPolicy = ConfigurationPolicy.OPTIONAL, service = MarkerSupport.class, property = {
		"markerKeys=entrypoint", "markerIds=us.coastalhacking.corvus.eclipse.resources.entrypoint" })
public class MarkerSupportProvider extends MarkerSupportBase {

	@interface Config {
		String[] markerKeys();

		String[] markerIds();
	}

	@Reference
	IWorkspace workspace;

	@Activate
	void activate(BundleContext bundleContext, Config config) {
		this.id = bundleContext.getBundle().getSymbolicName();
		super.activate(config.markerKeys(), config.markerIds());
	}

	@Deactivate
	protected void deactivate() {
		super.deactivate();
		this.id = null;
	}

	@Override
	protected IWorkspace getWorkspace() {
		return workspace;
	}

}
