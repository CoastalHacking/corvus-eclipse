package us.coastalhacking.corvus.eclipse.app.provider;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.osgi.framework.ServiceReference;
import us.coastalhacking.corvus.eclipse.app.CorvusAppApi;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesApi;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesChangeListener;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesInitializer;
import us.coastalhacking.corvus.eclipse.test.utils.AbstractCMTest;
import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalFactory;
import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalRegistry;

class CorvusAppProviderTest extends AbstractCMTest {

	public CorvusAppProviderTest() throws Exception {
		super();
	}

	@Test
	void shouldConfigure() throws Exception {
		Map<String, Object> props = new HashMap<>();
		// Properties
		String uriKey = "test:EclipseResourcesChangeListenerProviderTest";
		props.put(EclipseResourcesApi.EclipseResourcesInitializer.Properties.URI_KEY, uriKey);
		String pathKey = "EclipseResourcesChangeListenerProviderTest.shouldConfigure.xmi";
		props.put(EclipseResourcesApi.EclipseResourcesInitializer.Properties.PATH_KEY, getTempFolderNewFile(pathKey));
		String markerType = "org.eclipse.core.resources.textmarker";
		props.put(EclipseResourcesApi.EclipseResourcesChangeListener.Properties.MARKER_TYPE, markerType);
		String transactionId = "test.app.provider";
		props.put(EclipseResourcesApi.TransactionalEditingDomain.Properties.ID, transactionId);

		// Configure app
		CorvusAppProvider provider = (CorvusAppProvider) configurationHelper(EclipseResourcesChangeListener.class,
				CorvusAppApi.CorvusApp.Component.CONFIG_PID, props, timeout);
		assertNotNull(provider);

		// Now, since the app doesn't require any of the services directly, we need to
		// test for them differently
		final Map<Class<?>, Boolean> found = new HashMap<>();
		found.put(EclipseResourcesInitializer.class, false);
		found.put(CorvusTransactionalFactory.class, false);
		found.put(CorvusTransactionalRegistry.class, false);
		found.put(EclipseResourcesChangeListener.class, false);

		String clazz = null;
		ServiceReference<?>[] serviceReferences = getBundleContext().getServiceReferences(clazz,
				String.format("(%s=%s)", EclipseResourcesApi.TransactionalEditingDomain.Properties.ID, transactionId));
		Arrays.stream(serviceReferences).sequential().forEach(sr -> {
			Object service = getBundleContext().getService(sr);
			for (Class<?> clz : found.keySet()) {
				if (clz.isInstance(service)) {
					found.put(clz, true);
				}
			}
		});

		for (Map.Entry<Class<?>, Boolean> entry : found.entrySet()) {
			if (entry.getValue() == false) {
				fail(String.format("Did not find an expected instance of class %s", entry.getKey()));
			}
		}
	}

}
