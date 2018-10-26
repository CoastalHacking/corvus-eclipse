package us.coastalhacking.corvus.eclipse.transaction.provider;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.junit.jupiter.api.Test;

import us.coastalhacking.corvus.eclipse.test.utils.AbstractCMTest;
import us.coastalhacking.corvus.eclipse.test.utils.UtilsFactory;
import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalFactory;
import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalRegistry;
import us.coastalhacking.corvus.eclipse.transaction.EclipseTransactionApi;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;

// TODO: copypasta'd code from the sibling factory test
class CorvusTransactionalRegistryProviderTest extends AbstractCMTest {

	public CorvusTransactionalRegistryProviderTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	void shouldConfigure() throws Exception {
		// Create and register a resource initializer
		String uriKey = "test.initializer2.uri.key";
		String pathKey = "test.initializer2.uri.path";
		EObject expectedRoot = UtilsFactory.eINSTANCE.createTestRoot();
		ResourceInitializer testInitializer = new ResourceInitializer() {
			@Override
			public String getUriKey() {
				return uriKey;
			}

			@Override
			public EObject getRoot() {
				return expectedRoot;
			}

			@Override
			public String getPathKey() {
				return pathKey;
			}
		};

		Map<String, Object> props = new HashMap<>();
		String uriValue = "test:CorvusTransactionalRegistryProviderTest";
		props.put(uriKey, uriValue);
		props.put(pathKey, getTempFolderNewFile("CorvusTransactionalRegistryProviderTest.shouldConfigure.xmi"));
		serviceRegistrations.add(
				getBundleContext().registerService(ResourceInitializer.class, testInitializer, new Hashtable<>(props)));

		// Configure factory
		configurationHelper(CorvusTransactionalFactory.class,
				EclipseTransactionApi.CorvusTransactionalFactory.Component.CONFIG_PID, props, timeout);

		// Configure registry
		CorvusTransactionalRegistry service = configurationHelper(CorvusTransactionalRegistry.class,
				EclipseTransactionApi.CorvusTransactionalRegistry.Component.CONFIG_PID, props, timeout);
		assertNotNull(service);
		String transactionalId = "this.dose.not.exist";
		TransactionalEditingDomain domain = service.getEditingDomain(transactionalId);
		assertNotNull(domain);
		TransactionalEditingDomain removedDomain = service.remove(transactionalId);
		assertNotNull(removedDomain);
		assertEquals(domain, removedDomain);
		removedDomain = service.remove(transactionalId);
		assertNull(removedDomain);
		service.add(transactionalId, domain);
		assertEquals(domain, service.remove(transactionalId));
	}

}
