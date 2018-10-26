package us.coastalhacking.corvus.eclipse.resources;

public interface EclipseResourcesApi {

	@Deprecated
	String URI_KEY = "corvus:eclipse.resources";
	
	@Deprecated
	String PATH_KEY = "corvus.eclipse.resources.path";

	interface EclipseResourcesInitializer {
		
		interface Component {
			String CONFIG_PID = "corvus.eclipse.resources.initializer";
		}
		
		interface Properties {
			String URI_KEY = "corvus:eclipse.resources";
			String PATH_KEY = "corvus.eclipse.resources.path";
		}		
	}	

}
