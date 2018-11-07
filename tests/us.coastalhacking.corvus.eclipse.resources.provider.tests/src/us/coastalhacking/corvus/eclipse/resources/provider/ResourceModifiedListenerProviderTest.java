package us.coastalhacking.corvus.eclipse.resources.provider;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Hashtable;

import org.junit.jupiter.api.Test;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesApi;
import us.coastalhacking.corvus.eclipse.resources.ResourceModifiedListener;
import us.coastalhacking.corvus.eclipse.test.utils.AbstractProjectTest;
import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalFactory;
import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalRegistry;

class ResourceModifiedListenerProviderTest extends AbstractProjectTest {

	public ResourceModifiedListenerProviderTest() throws Exception {
		super();
	}

	@Test
	void shouldConfigure() throws Exception {
		Hashtable<String, Object> props = new Hashtable<>();
		String transId = "test.eclipseresources.modified.listener";
		props.put(EclipseResourcesApi.TransactionalEditingDomain.Properties.ID, transId);

		// Configure factory
		configurationHelper(CorvusTransactionalFactory.class,
				EclipseResourcesApi.CorvusTransactionalFactory.Component.CONFIG_PID, props, timeout);

		// Configure registry
		CorvusTransactionalRegistry registry = configurationHelper(CorvusTransactionalRegistry.class,
				EclipseResourcesApi.CorvusTransactionalRegistry.Component.CONFIG_PID, props, timeout);
		// ensure it's provided
		assertNotNull(registry);

		ResourceModifiedListenerProvider provider = (ResourceModifiedListenerProvider)configurationHelper(ResourceModifiedListener.class, EclipseResourcesApi.ResourceModifiedListener.Component.CONFIG_PID, props, timeout);
		assertNotNull(provider);
	}

}
