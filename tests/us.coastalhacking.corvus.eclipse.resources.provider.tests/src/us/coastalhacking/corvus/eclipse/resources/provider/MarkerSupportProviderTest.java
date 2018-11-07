package us.coastalhacking.corvus.eclipse.resources.provider;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Hashtable;

import org.junit.jupiter.api.Test;
import org.osgi.framework.ServiceRegistration;

import us.coastalhacking.corvus.eclipse.resources.MarkerProvider;
import us.coastalhacking.corvus.eclipse.resources.MarkerSupport;
import us.coastalhacking.corvus.eclipse.test.utils.AbstractProjectTest;

public class MarkerSupportProviderTest extends AbstractProjectTest {

	public MarkerSupportProviderTest() throws Exception {
		super();
	}

	@Test
	void shouldConfigure() throws Exception {
		
		final String expectedKey = "someKey";
		final String expectedValue = "us.coastalhacking.corvus.eclipse.resources.marker";
		final MarkerProvider markerProvider = new MarkerProvider() {
			@Override
			public String getKey() {
				return expectedKey;
			}

			@Override
			public String getValue() {
				return expectedValue;
			}
		};

		ServiceRegistration<MarkerProvider> markerProviderReg = getBundleContext().registerService(MarkerProvider.class, markerProvider, new Hashtable<>());
		serviceRegistrations.add(markerProviderReg);
		
		MarkerSupport supportProvider = serviceTrackerHelper(MarkerSupport.class);
		assertNotNull(supportProvider);
	}
}
