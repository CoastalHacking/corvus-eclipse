package us.coastalhacking.corvus.eclipse.app;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesApi;

public interface CorvusAppApi extends EclipseResourcesApi {

	interface CorvusApp {
		interface Component {
			String FACTORY = "corvus.eclipse.app.factory";
		}
		
	}
}
