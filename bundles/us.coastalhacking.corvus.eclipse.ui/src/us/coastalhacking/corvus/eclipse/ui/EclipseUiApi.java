package us.coastalhacking.corvus.eclipse.ui;

public interface EclipseUiApi {
	interface Model {
		interface Command {
			String ID = "us.coastalhacking.corvus.eclipse.ui.command";
		}

		interface CommandParameter {
			String MARKER = "us.coastalhacking.corvus.eclipse.ui.commandparameter.marker";
			String ACTION = "us.coastalhacking.corvus.eclipse.ui.commandparameter.action";
			String ACTION_ADD = "add";
		}

		interface Menu {
			String ID = "us.coastalhacking.corvus.eclipse.ui.menu";
		}
	}
	
	@Deprecated
	interface CommandParameter {
		String MARKER = "us.coastalhacking.corvus.eclipse.ui.commandparameter.marker";
		String ACTION = "us.coastalhacking.corvus.eclipse.ui.commandparameter.action";
		String ACTION_ADD = "add";
	}

	interface Event {

		interface Marker {
			String TOPIC_ALL = "us/coastalhacking/corvus/eclipse/ui/marker/*";
			String TOPIC_ADD = "us/coastalhacking/corvus/eclipse/ui/marker/ADD";
			String PROP_TYPE = "corvus.eclipse.marker.type";
		}
	}

	interface MarkerUiSupport {
		interface Component {
			String CONFIG_PID = "corvus.eclipseui.markeruisupport";
		}
	}
	
}
