package us.coastalhacking.corvus.eclipse.transaction.provider;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.junit.jupiter.api.Test;

import us.coastalhacking.corvus.eclipse.test.utils.AbstractCMTest;
import us.coastalhacking.corvus.eclipse.test.utils.UtilsFactory;
import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalFactory;
import us.coastalhacking.corvus.eclipse.transaction.EclipseTransactionApi;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;

class CorvusTransactionalFactoryProviderTest extends AbstractCMTest {

	public CorvusTransactionalFactoryProviderTest() throws Exception {
		super();
	}

	@Test
	void shouldConfigure() throws Exception {

		// Create and register a resource initializer
//		String uriKey = "test.initializer.uri.key";
//		String pathKey = "test.initializer.uri.path";
		EObject expectedRoot = UtilsFactory.eINSTANCE.createTestRoot();
		final URI logicalUri = URI.createURI("test:CorvusTransactionalFactoryProviderTest");
		final URI physicalUri = URI.createFileURI(getTempFolderNewFile("CorvusTransactionalFactoryProviderTest.shouldConfigure.xmi"));
		ResourceInitializer testInitializer = new ResourceInitializer() {
			@Override
			public URI getLogical() {
				return logicalUri;
			}

			@Override
			public EObject getRoot() {
				return expectedRoot;
			}

			@Override
			public URI getPhysical() {
				return physicalUri;
			}
		};

		Map<String, Object> props = new HashMap<>();
//		String uriValue = "test:CorvusTransactionalFactoryProviderTest";
//		props.put(uriKey, uriValue);
//		props.put(pathKey, getTempFolderNewFile("shouldConfigure.xmi"));
		serviceRegistrations.add(
				getBundleContext().registerService(ResourceInitializer.class, testInitializer, new Hashtable<>(props)));

		// Get the factory
		CorvusTransactionalFactory service = configurationHelper(CorvusTransactionalFactory.class,
				EclipseTransactionApi.CorvusTransactionalFactory.Component.CONFIG_PID, props, timeout);
		assertNotNull(service);
		TransactionalEditingDomain domain = service.createEditingDomain();
		
		domain.runExclusive(() -> {
			Resource resource = domain.getResourceSet().getResource(logicalUri, true);
			assertNotNull(resource);
			EObject actualRoot = resource.getContents().get(0);
			assertTrue(EcoreUtil.equals(expectedRoot, actualRoot));
		});
	}
}
