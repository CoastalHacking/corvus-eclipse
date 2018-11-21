package us.coastalhacking.corvus.emf.provider;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain.Factory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.osgi.framework.ServiceRegistration;

import us.coastalhacking.corvus.emf.EmfApi;
import us.coastalhacking.corvus.emf.ResourceInitializer;
import us.coastalhacking.corvus.emf.TransactionIdUtil;
import us.coastalhacking.corvus.test.util.AbstractProjectTest;
import us.coastalhacking.corvus.test.util.UtilFactory;
import us.coastalhacking.corvus.test.util.UtilPackage;

class CorvusTransactionalFactoryProviderTest extends AbstractProjectTest {

	public CorvusTransactionalFactoryProviderTest() throws Exception {
		super();
	}

	TransactionIdUtil idUtil;
	Map<String, Object> props;
	String id;
	Factory factory;

	final String logical = "test:" + getClass().getName();
	final String physical = "physical.xmi";

	@BeforeEach
	void subBeforeEach() throws Exception {

		ResourceInitializer testInitializer = new ResourceInitializer() {
			@Override
			public String getLogical() {
				return logical;
			}

			@Override
			public String getPhysical() {
				return physical;
			}
			
			@Override
			public EObject getRoot() {
				return UtilFactory.eINSTANCE.createTestRoot();
			}
		};

		// Then register the service afterward to test dynamic / greedy OSGi reference binding
		ServiceRegistration<ResourceInitializer> reg = getBundleContext().registerService(ResourceInitializer.class, testInitializer, new Hashtable<>());
		serviceRegistrations.add(reg);
		ResourceInitializer actualInitializer = getBundleContext().getService(reg.getReference());
		assertEquals(testInitializer, actualInitializer);

		idUtil = serviceTrackerHelper(TransactionIdUtil.class);
		assertNotNull(idUtil);
		props = new HashMap<>();
		id = idUtil.getId(project);
		idUtil.putId(props, id);
		factory = configurationHelper(Factory.class,
				EmfApi.CorvusTransactionalFactory.Component.CONFIG_PID, props, timeout);
		assertNotNull(factory);

	}
	
	@Test
	void shouldConfigure() throws Exception {

		// Execute
		TransactionalEditingDomain domain = factory.createEditingDomain();
		
		// Verify
		domain.runExclusive(() -> {
			Resource resource = domain.getResourceSet().getResource(URI.createURI(logical), true);
			assertNotNull(resource);
			EObject root = resource.getContents().get(0);
			assertTrue(root.eClass().equals(UtilPackage.Literals.TEST_ROOT));
		});
	}
}
