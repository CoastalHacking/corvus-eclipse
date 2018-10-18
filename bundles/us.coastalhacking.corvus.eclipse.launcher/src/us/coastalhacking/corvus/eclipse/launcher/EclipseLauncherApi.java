package us.coastalhacking.corvus.eclipse.launcher;

public interface EclipseLauncherApi {

	interface Component {
		String CORVUS_LAUNCHER_FACTORY = "corvus.launcher.factory";
	}
	
	interface Properties {
		String CORVUS_TRANSACTION_ID = "corvus.transaction.id";
	}
}
