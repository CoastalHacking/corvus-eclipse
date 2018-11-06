package us.coastalhacking.corvus.eclipse.resources.provider;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.junit.jupiter.api.Test;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesApi;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesChangeListener;
import us.coastalhacking.corvus.eclipse.test.utils.AbstractCMTest;
import us.coastalhacking.corvus.eclipse.test.utils.TestUtils;
import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalFactory;
import us.coastalhacking.corvus.eclipse.transaction.CorvusTransactionalRegistry;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;

class EclipseResourcesChangeListenerProviderTest extends AbstractCMTest {

	public EclipseResourcesChangeListenerProviderTest() throws Exception {
		super();
	}

	@Test
	void shouldConfigure() throws Exception {
		Map<String, Object> props = new HashMap<>();
		// Properties
		
		String uriKey = "test:EclipseResourcesChangeListenerProviderTest";
		props.put(EclipseResourcesApi.EclipseResourcesInitializer.Properties.LOGICAL, uriKey);
		String pathKey = "EclipseResourcesChangeListenerProviderTest.shouldConfigure.xmi";
		IWorkspace workspace = TestUtils.getService(getBundleContext(), IWorkspace.class, 250);
		assertNotNull(workspace);
		IProject project = workspace.getRoot().getProject(getClass().getName());
		project.create(null);
		project.open(null);

		// Create file in project
		IFile file = project.getFile(pathKey);
		String fullPath = file.getFullPath().toPortableString();
		props.put(EclipseResourcesApi.EclipseResourcesInitializer.Properties.PHYSICAL, fullPath);
		
		String markerType = EclipseResourcesApi.BASE_MARKER;
		props.put(EclipseResourcesApi.EclipseResourcesChangeListener.Properties.MARKER_TYPE, markerType);
		String transactionId = "eclipse.resources.test.listener.provider";
		props.put(EclipseResourcesApi.TransactionalEditingDomain.Properties.ID, transactionId);

		// Configure initializer
		configurationHelper(ResourceInitializer.class, EclipseResourcesApi.EclipseResourcesInitializer.Component.CONFIG_PID, props, timeout);

		// Configure factory
		configurationHelper(CorvusTransactionalFactory.class,
				EclipseResourcesApi.CorvusTransactionalFactory.Component.CONFIG_PID, props, timeout);

		// Configure registry
		configurationHelper(CorvusTransactionalRegistry.class,
				EclipseResourcesApi.CorvusTransactionalRegistry.Component.CONFIG_PID, props, timeout);

		// Configure change listener
		EclipseResourcesChangeListenerProvider provider = (EclipseResourcesChangeListenerProvider)configurationHelper(EclipseResourcesChangeListener.class, EclipseResourcesApi.EclipseResourcesChangeListener.Component.CONFIG_PID, props, timeout);
		assertNotNull(provider);

		project.delete(true, null);
	}


}
