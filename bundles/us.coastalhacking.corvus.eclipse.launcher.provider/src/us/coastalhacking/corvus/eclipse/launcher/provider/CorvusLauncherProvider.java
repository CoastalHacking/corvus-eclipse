package us.coastalhacking.corvus.eclipse.launcher.provider;

import java.util.Collection;
import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import us.coastalhacking.corvus.eclipse.launcher.EclipseLauncherApi;
import us.coastalhacking.corvus.eclipse.launcher.ResourceInitializer;

@Component(factory=EclipseLauncherApi.Component.CORVUS_LAUNCHER_FACTORY)
public class CorvusLauncherProvider extends CorvusLauncherBase {

	@Reference
	Collection<ResourceInitializer> initializers;

	@Activate
	void activate(Map<String, ?> props) throws Exception {
		super.baseActivate(props);
	}

	@Deactivate
	void deactivate(Map<String, ?> props) {
		super.baseDeactivate(props);
	}

	@Override
	protected Collection<ResourceInitializer> getInitializers() {
		return initializers;
	}

}
