package us.coastalhacking.corvus.entrypoint;

public interface EntryPointApi {
	interface MarkerProvider {
		interface Properties {
			String KEY = "entrypoint";
			String VALUE = "us.coastalhacking.corvus.entrypoint.marker";
		}
	}

	interface ResourceInitializer {
		interface Properties {
			String LOGICAL = "corvus.entrypoint.initializer.logical";
			String PHYSICAL = "corvus.entrypoint.initializer.physical";
		}

		interface Component {
			String CONFIG_PID = "corvus.entrypoint.initializer";
		}
	}
}
