package us.coastalhacking.corvus.eclipse.resources;

import us.coastalhacking.corvus.eclipse.transaction.EclipseTransactionApi;

public interface EclipseResourcesApi extends EclipseTransactionApi {

	interface EclipseResourcesInitializer {
		interface Component {
			String CONFIG_PID = "corvus.eclipseresources.initializer";
		}

		interface Properties {
			String URI_KEY = "corvus:eclipseresources";
			String PATH_KEY = "corvus.eclipseresources.path";
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
}
