package us.coastalhacking.corvus.eclipse.resources;

import us.coastalhacking.corvus.eclipse.transaction.EclipseTransactionApi;

public interface EclipseResourcesApi extends EclipseTransactionApi {

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
}
