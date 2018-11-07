package us.coastalhacking.corvus.entrypoint.provider;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.junit.jupiter.api.Test;

import us.coastalhacking.corvus.eclipse.test.utils.AbstractProjectTest;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;
import us.coastalhacking.corvus.entrypoint.EntryPointApi;

class EntryPointResourceInitializerProviderTest extends AbstractProjectTest {

	public EntryPointResourceInitializerProviderTest() throws Exception {
		super();
	}

	@Test
	void shouldConfigure() throws Exception {
		final Map<String, Object> props = new HashMap<>();
		String uriKey = String.format("test:%s", getClass().getName());
		final String logical = EntryPointApi.ResourceInitializer.Properties.LOGICAL;
		final String physical = EntryPointApi.ResourceInitializer.Properties.PHYSICAL; 
		props.put(logical, uriKey);
		final String pathKey = String.format("%s.shouldConfigure.xmi", getClass().getName());
		IFile file = createFile(pathKey, "");
		String fullPath = file.getFullPath().toPortableString();
		props.put(physical, fullPath);

		// Call & verify
		ResourceInitializer initializer = configurationHelper(ResourceInitializer.class, EntryPointApi.ResourceInitializer.Component.CONFIG_PID, props, timeout);
		assertTrue(initializer instanceof EntryPointResourceInitializerProvider);
	}

}
