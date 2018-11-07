package us.coastalhacking.corvus.eclipse.resources.provider;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.junit.jupiter.api.Test;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesApi;
import us.coastalhacking.corvus.eclipse.test.utils.AbstractProjectTest;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;

class EclipseResourcesInitializerProviderTest extends AbstractProjectTest {

	public EclipseResourcesInitializerProviderTest() throws Exception {
		super();
	}

	@Test
	void shouldConfigure() throws Exception {
		// Configure
		Map<String, Object> props = new HashMap<>();
		String uriKey = "test:EclipseResourcesChangeListenerProviderTest";
		props.put(EclipseResourcesApi.EclipseResourcesInitializer.Properties.LOGICAL, uriKey);
		String pathKey = "EclipseResourcesChangeListenerProviderTest.shouldConfigure.xmi";
		IFile file = createFile(pathKey, "");
		String fullPath = file.getFullPath().toPortableString();
		props.put(EclipseResourcesApi.EclipseResourcesInitializer.Properties.PHYSICAL, fullPath);

		// Call & verify
		ResourceInitializer initializer = configurationHelper(ResourceInitializer.class, EclipseResourcesApi.EclipseResourcesInitializer.Component.CONFIG_PID, props, timeout);
		assertTrue(initializer instanceof EclipseResourcesInitializerProvider);
	}

}
