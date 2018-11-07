package us.coastalhacking.corvus.eclipse.resources;

import us.coastalhacking.corvus.eclipse.transaction.EclipseTransactionApi;

public interface EclipseResourcesApi extends EclipseTransactionApi {

	String BASE_MARKER = "us.coastalhacking.corvus.eclipse.resources.marker";
	
	interface EclipseResourcesInitializer {
		interface Component {
			String CONFIG_PID = "corvus.eclipseresources.init";
		}

		interface Properties {
			String LOGICAL = "corvus.eclipseresources.init.logical";
			String DEFAULT_LOGICAL = "corvus:eclipseResources";
			String PHYSICAL = "corvus.eclipseresources.init.physical";
		}
	}

	interface EclipseResourcesChangeListener {
		interface Component {
			String CONFIG_PID = "corvus.eclipseresources.listener";
		}

		interface Properties {
			String MARKER_TYPE = "corvus.eclipseresources.listener.markertype";
		}

		interface Reference {
			String REGISTRY = "corvus.eclipseresources.listener.registry";
		}
	}
	
	interface ResourceModifiedListener {
		interface Component {
			String CONFIG_PID = "corvus.resourcemodified.listener";
		}

		interface Reference {
			String REGISTRY = "corvus.resourcemodified.listener.registry";
		}
	}
	
	interface MarkerSupport {
		interface Component {
			String CONFIG_PID = "corvus.eclipseresources.markersupport";
		}
		
		interface Reference {
			String MARKER_PROVIDER = "corvus.markersupport.markerprovider";
		}
	}
	
	interface MarkerProvider {
		interface Properties {
			String KEY = "corvus.markerprovider.key";
			String VALUE = "corvus.markerprovider.value";
		}
	}
}
