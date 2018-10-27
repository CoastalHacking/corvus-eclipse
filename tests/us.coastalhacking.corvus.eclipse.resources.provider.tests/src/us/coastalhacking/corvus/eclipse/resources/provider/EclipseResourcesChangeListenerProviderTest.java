package us.coastalhacking.corvus.eclipse.resources.provider;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesApi;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesChangeListener;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesInitializer;
import us.coastalhacking.corvus.eclipse.test.utils.AbstractCMTest;
import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalFactory;
import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalRegistry;

class EclipseResourcesChangeListenerProviderTest extends AbstractCMTest {

	public EclipseResourcesChangeListenerProviderTest() throws Exception {
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
		String transactionId = "test.change.provider";
		props.put(EclipseResourcesApi.TransactionalEditingDomain.Properties.ID, transactionId);

		// Configure initializer
		configurationHelper(EclipseResourcesInitializer.class, EclipseResourcesApi.EclipseResourcesInitializer.Component.CONFIG_PID, props, timeout);

		// Configure factory
		configurationHelper(CorvusTransactionalFactory.class,
				EclipseResourcesApi.CorvusTransactionalFactory.Component.CONFIG_PID, props, timeout);

		// Configure registry
		configurationHelper(CorvusTransactionalRegistry.class,
				EclipseResourcesApi.CorvusTransactionalRegistry.Component.CONFIG_PID, props, timeout);

		// Configure change listener
		EclipseResourcesChangeListenerProvider provider = (EclipseResourcesChangeListenerProvider)configurationHelper(EclipseResourcesChangeListener.class, EclipseResourcesApi.EclipseResourcesChangeListener.Component.CONFIG_PID, props, timeout);
		assertNotNull(provider);
	}


}