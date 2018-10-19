package us.coastalhacking.corvus.eclipse.launcher.provider;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Rule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.rules.TemporaryFolder;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.component.ComponentFactory;
import org.osgi.service.component.ComponentInstance;

import us.coastalhacking.corvus.eclipse.launcher.EclipseLauncherApi;
import us.coastalhacking.corvus.eclipse.test.utils.TestUtils;
import us.coastalhacking.corvus.eclipse.transaction.EclipseTransactionApi;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializerBase;

class CorvusLauncherProviderTest {

	static BundleContext bundleContext;

	@Rule
	TemporaryFolder tempFolder = new TemporaryFolder();

	public CorvusLauncherProviderTest() throws Exception {
		tempFolder.create();
	}

	@BeforeAll
	static void beforeAll() throws Exception {
		bundleContext = FrameworkUtil.getBundle(CorvusLauncherBaseTest.class).getBundleContext();
		assertNotNull(bundleContext);

	}

	@AfterAll
	static void afterAll() {
		bundleContext = null;
	}

	@Test
	void shouldCreateResource() throws Exception {

		Map<String, Object> props = new HashMap<>();
		props.put(EclipseTransactionApi.Properties.CORVUS_TRANSACTION_ID,
				getClass().getName() + UUID.randomUUID().toString());

		// Create and prep service
		ResourceInitializerBase service = new ResourceInitializerBase();

		final String uriKey = "test:provider.should.create";
		service.setUriKey(uriKey);
		final String pathKey = "test.provider.should.create";
		service.setPathKey(pathKey);

		Path xmi = Paths.get(tempFolder.getRoot().getAbsolutePath(), "test.xmi");
		String pathValue = xmi.toFile().getAbsolutePath();
		props.put(pathKey, pathValue);

		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		ePackage.getEClassifiers().add(eClass);
		final EObject eObject = ePackage.getEFactoryInstance().create(eClass);
		service.setRoot(eObject);

		// Register service
		bundleContext.registerService(ResourceInitializer.class, service, new Hashtable<>());

		// Acquire CorvusLauncher ComponentFactory
		ComponentFactory launcherFactory = TestUtils.getService(bundleContext, ComponentFactory.class, 250,
				MessageFormat.format("(component.factory={0})", EclipseLauncherApi.Component.CORVUS_LAUNCHER_FACTORY));
		assertNotNull(launcherFactory);
		ComponentInstance instance = launcherFactory.newInstance(new Hashtable<>(props));
		CorvusLauncherProvider provider = (CorvusLauncherProvider) instance.getInstance();
		assertNotNull(provider);

		provider.getDomain().runExclusive(() -> {
			Resource actualResource = provider.getResourceSet().getResource(URI.createURI(uriKey), true);
			assertNotNull(actualResource);
			EObject actualEObject = actualResource.getContents().get(0);
			assertEquals(eObject, actualEObject);
		});
	}

}
