package us.coastalhacking.corvus.eclipse.launcher.provider;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain.Registry;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.TemporaryFolder;

import us.coastalhacking.corvus.eclipse.transaction.EclipseTransactionApi;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;

public class CorvusLauncherBaseTest {

	@Rule
	TemporaryFolder tempFolder = new TemporaryFolder();

	public CorvusLauncherBaseTest() throws Exception {
		tempFolder.create();
	}

	@Test
	void shouldActivate() throws Exception {
		Map<String, Object> props = new HashMap<>();
		String transactionId = getClass().getName() + ".shouldActivate";

		props.put(EclipseTransactionApi.Properties.CORVUS_TRANSACTION_ID, transactionId);

		final List<ResourceInitializer> initializers = new ArrayList<>();

		String uriKey = "test:should.activate";
		String pathKey = "test.should.activate";

		Path xmi = Paths.get(tempFolder.getRoot().getAbsolutePath(), "test.xmi");
		String pathValue = xmi.toFile().getAbsolutePath();
		props.put(pathKey, pathValue);

		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		ePackage.getEClassifiers().add(eClass);
		EObject eObject = ePackage.getEFactoryInstance().create(eClass);

		initializers.add(new ResourceInitializer() {

			@Override
			public String getUriKey() {
				return uriKey;
			}

			@Override
			public EObject getRoot() {
				return eObject;
			}

			@Override
			public String getPathKey() {
				return pathKey;
			}
		});

		CorvusLauncherBase base = new CorvusLauncherBase() {
			@Override
			protected Collection<ResourceInitializer> getInitializers() {
				return initializers;
			}

			@Override
			protected TransactionalEditingDomain.Registry getDomainRegistry() {
				return Registry.INSTANCE;
			}

			@Override
			protected WorkspaceEditingDomainFactory getDomainFactory() {
				return WorkspaceEditingDomainFactory.INSTANCE;
			}
		};

		// Test
		base.baseActivate(props);

		// Verify
		base.getDomain().runExclusive(() -> {
			Resource actualResource = base.getResourceSet().getResource(URI.createURI(uriKey), true);
			assertNotNull(actualResource);
			EObject actualEObject = actualResource.getContents().get(0);
			assertEquals(eObject, actualEObject);
		});
	}

}
