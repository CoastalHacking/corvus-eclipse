package us.coastalhacking.corvus.eclipse.launcher;

import us.coastalhacking.corvus.eclipse.app.CorvusAppApi;

public interface CorvusLaunchApi extends CorvusAppApi {
	interface CorvusLaunch {
		interface Component {
			String FACTORY = "corvus.launch.factory.launcher";
		}
		interface Reference {
			String APP_FACTORY = "corvus.launch.app.factory";
		}
	}

	interface CorvusLaunchTab {
		interface Component {
			String FACTORY = "corvus.launch.factory.tabgroup";
		}
	}
}
