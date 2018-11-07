package us.coastalhacking.corvus.entrypoint.provider;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesApi;
import us.coastalhacking.corvus.eclipse.test.utils.AbstractCMTest;
import us.coastalhacking.corvus.entrypoint.EntryPointApi;
import us.coastalhacking.corvus.entrypoint.provider.EntryPointMarkerProvider;

class EntryPointMarkerProviderTest extends AbstractCMTest {

	public EntryPointMarkerProviderTest() throws Exception {
		super();
	}

	@Test
	void shouldConfigure() throws Exception {
		Map<String, Object> props = new HashMap<>();
		props.put(EclipseResourcesApi.MarkerProvider.Properties.KEY, EntryPointApi.MarkerProvider.Properties.KEY);
		props.put(EclipseResourcesApi.MarkerProvider.Properties.VALUE, EntryPointApi.MarkerProvider.Properties.VALUE);
		Object provider = serviceTrackerHelper(props);
		assertTrue(provider instanceof EntryPointMarkerProvider);
	}

}
