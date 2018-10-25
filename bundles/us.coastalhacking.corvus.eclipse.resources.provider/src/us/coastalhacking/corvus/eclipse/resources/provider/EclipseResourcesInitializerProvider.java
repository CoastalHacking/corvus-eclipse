package us.coastalhacking.corvus.eclipse.resources.provider;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesApi;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesFactory;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesInitializer;

@Component(service=EclipseResourcesInitializer.class, configurationPid=EclipseResourcesApi.EclipseResourcesInitializer.Component.CONFIG_PID, configurationPolicy=ConfigurationPolicy.REQUIRE)
public class EclipseResourcesInitializerProvider implements EclipseResourcesInitializer {

	private String uriKey;
	private String pathKey;
	
	@Activate
	void activate(Map<String, Object> props) {
		uriKey = (String) props.get(EclipseResourcesApi.EclipseResourcesInitializer.Properties.URI_KEY);
		pathKey = (String) props.get(EclipseResourcesApi.EclipseResourcesInitializer.Properties.PATH_KEY);
	}
	
	@Override
	public EObject getRoot() {
		return EclipseResourcesFactory.eINSTANCE.createIWorkspaceRoot();
	}

	@Override
	public String getUriKey() {
		return uriKey;
	}

	@Override
	public String getPathKey() {
		return pathKey;
	}

}
