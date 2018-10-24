package us.coastalhacking.corvus.eclipse.resources.provider;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesApi;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesFactory;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;

@Component(service=ResourceInitializer.class)
public class EclipseResourcesResourceInitializerProvider implements ResourceInitializer {

	@Override
	public EObject getRoot() {
		return EclipseResourcesFactory.eINSTANCE.createIWorkspaceRoot();
	}

	@Override
	public String getUriKey() {
		return EclipseResourcesApi.URI_KEY;
	}

	@Override
	public String getPathKey() {
		return EclipseResourcesApi.PATH_KEY;
	}

}
