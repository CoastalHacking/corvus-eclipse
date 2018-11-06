package us.coastalhacking.corvus.eclipse.app.provider;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.junit.jupiter.api.Test;
import org.osgi.service.component.ComponentConstants;
import org.osgi.service.component.ComponentFactory;
import org.osgi.service.component.ComponentInstance;

import us.coastalhacking.corvus.eclipse.app.CorvusApp;
import us.coastalhacking.corvus.eclipse.app.CorvusAppApi;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesApi;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesChangeListener;
import us.coastalhacking.corvus.eclipse.test.utils.AbstractCMTest;
import us.coastalhacking.corvus.eclipse.test.utils.TestUtils;
import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalFactory;
import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalRegistry;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;

class CorvusAppProviderTest extends AbstractCMTest {

	public CorvusAppProviderTest() throws Exception {
		super();
	}

	@Test
	void shouldConfigure() throws Exception {
		Hashtable<String, Object> props = new Hashtable<>();
		// Properties
		String uriKey = "test:CorvusAppProviderTest";
		props.put(EclipseResourcesApi.EclipseResourcesInitializer.Properties.LOGICAL, uriKey);
		String pathKey = "CorvusAppProviderTest.shouldConfigure.xmi";
		
		IWorkspace workspace = TestUtils.getService(getBundleContext(), IWorkspace.class, 250);
		assertNotNull(workspace);
		IProject project = workspace.getRoot().getProject(getClass().getName());
		project.create(null);
		project.open(null);

		// Create file in project
		IFile file = project.getFile(pathKey);
		String fullPath = file.getFullPath().toPortableString();
		
		props.put(EclipseResourcesApi.EclipseResourcesInitializer.Properties.PHYSICAL, fullPath);
		String markerType = "org.eclipse.core.resources.textmarker";
		props.put(EclipseResourcesApi.EclipseResourcesChangeListener.Properties.MARKER_TYPE, markerType);
		String transactionId = "test.app.provider";
		props.put(EclipseResourcesApi.TransactionalEditingDomain.Properties.ID, transactionId);

		// Get factory
 		ComponentFactory appFactory = TestUtils.getService(getBundleContext(), ComponentFactory.class, 1250, String.format("(%s=%s)", ComponentConstants.COMPONENT_FACTORY, CorvusAppApi.CorvusApp.Component.FACTORY)); 
		assertNotNull(appFactory);
		ComponentInstance instance = appFactory.newInstance(props);
		CorvusApp app = (CorvusApp) instance.getInstance();
		assertNotNull(app);

		// Now, since the app doesn't require any of the services directly, we need to
		// test for them differently
		final Map<Class<?>, Boolean> found = new HashMap<>();
		found.put(ResourceInitializer.class, false);
		found.put(CorvusTransactionalFactory.class, false);
		found.put(CorvusTransactionalRegistry.class, false);
		found.put(EclipseResourcesChangeListener.class, false);

		String filter = String.format("(%s=%s)", EclipseResourcesApi.TransactionalEditingDomain.Properties.ID, transactionId);
		found.keySet().forEach(clz -> {
			try {
				Object svc = TestUtils.getService(getBundleContext(), clz, 250, filter);
				assertNotNull(svc);
				found.put(clz, true);
			} catch (Exception e) {
				fail(e);
			}
		});
		
		for (Map.Entry<Class<?>, Boolean> entry : found.entrySet()) {
			if (entry.getValue() == false) {
				fail(String.format("Did not find an expected instance of class %s", entry.getKey()));
			}
		}
	}

}
