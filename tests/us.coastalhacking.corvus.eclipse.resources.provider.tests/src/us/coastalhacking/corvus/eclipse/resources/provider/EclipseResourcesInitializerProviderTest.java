package us.coastalhacking.corvus.eclipse.resources.provider;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesApi;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesInitializer;
import us.coastalhacking.corvus.eclipse.test.utils.AbstractCMTest;

class EclipseResourcesInitializerProviderTest extends AbstractCMTest {

	public EclipseResourcesInitializerProviderTest() throws Exception {
		super();
	}

	@Test
	void shouldConfigure() throws Exception {
		Map<String, Object> props = new HashMap<>();
		props.put(EclipseResourcesApi.EclipseResourcesInitializer.Properties.URI_KEY, "test:EclipseResourcesInitializerProviderTest");
		props.put(EclipseResourcesApi.EclipseResourcesInitializer.Properties.PATH_KEY, getTempFolderNewFile("shouldConfigure.xmi"));
		EclipseResourcesInitializer initializer = configurationHelper(EclipseResourcesInitializer.class, EclipseResourcesApi.EclipseResourcesInitializer.Component.CONFIG_PID, props, timeout);
		assertNotNull(initializer);
	}

}
