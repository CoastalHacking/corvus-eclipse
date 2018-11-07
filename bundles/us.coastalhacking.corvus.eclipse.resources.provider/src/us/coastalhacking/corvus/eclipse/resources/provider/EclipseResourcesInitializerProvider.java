package us.coastalhacking.corvus.eclipse.resources.provider;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesApi;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesFactory;
import us.coastalhacking.corvus.eclipse.transaction.BaseResourceInitializer;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;

@Component(service = ResourceInitializer.class, configurationPid = EclipseResourcesApi.EclipseResourcesInitializer.Component.CONFIG_PID, configurationPolicy = ConfigurationPolicy.REQUIRE, immediate = true)
public class EclipseResourcesInitializerProvider extends BaseResourceInitializer {

	@Activate
	void activate(Map<String, Object> props) {
		baseActivate(props, EclipseResourcesApi.EclipseResourcesInitializer.Properties.LOGICAL,
				EclipseResourcesApi.EclipseResourcesInitializer.Properties.PHYSICAL);

	}

	@Override
	public EObject getRoot() {
		return EclipseResourcesFactory.eINSTANCE.createIWorkspaceRoot();
	}

}
