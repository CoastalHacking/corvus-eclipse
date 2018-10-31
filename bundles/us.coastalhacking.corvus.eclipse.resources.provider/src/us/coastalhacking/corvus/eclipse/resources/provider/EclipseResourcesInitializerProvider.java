package us.coastalhacking.corvus.eclipse.resources.provider;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesApi;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesFactory;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesInitializer;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;

@Component(service= {EclipseResourcesInitializer.class, ResourceInitializer.class}, configurationPid=EclipseResourcesApi.EclipseResourcesInitializer.Component.CONFIG_PID, configurationPolicy=ConfigurationPolicy.REQUIRE, immediate=true)
public class EclipseResourcesInitializerProvider implements EclipseResourcesInitializer {

	private URI logical;
	private URI physical;
	
	@Activate
	void activate(Map<String, Object> props) {
		String logicalUri = (String) props.get(EclipseResourcesApi.EclipseResourcesInitializer.Properties.LOGICAL);
		logical = URI.createURI(logicalUri);
		String physicalUri = (String) props.get(EclipseResourcesApi.EclipseResourcesInitializer.Properties.PHYSICAL);
		physical = URI.createPlatformResourceURI(physicalUri, true);
	}
	
	@Override
	public EObject getRoot() {
		return EclipseResourcesFactory.eINSTANCE.createIWorkspaceRoot();
	}

	@Override
	public URI getLogical() {
		return logical;
	}

	@Override
	public URI getPhysical() {
		return physical;
	}
}
