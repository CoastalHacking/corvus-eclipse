package us.coastalhacking.corvus.eclipse.resources.provider;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.junit.jupiter.api.Test;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesApi;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesInitializer;
import us.coastalhacking.corvus.eclipse.test.utils.AbstractCMTest;
import us.coastalhacking.corvus.eclipse.test.utils.TestUtils;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;

class EclipseResourcesInitializerProviderTest extends AbstractCMTest {

	public EclipseResourcesInitializerProviderTest() throws Exception {
		super();
	}

	@Test
	void shouldConfigure() throws Exception {
		// Configure
		Map<String, Object> props = new HashMap<>();
		String uriKey = "test:EclipseResourcesChangeListenerProviderTest";
		props.put(EclipseResourcesApi.EclipseResourcesInitializer.Properties.LOGICAL, uriKey);
		String pathKey = "EclipseResourcesChangeListenerProviderTest.shouldConfigure.xmi";
		IWorkspace workspace = TestUtils.getService(getBundleContext(), IWorkspace.class, 250);
		assertNotNull(workspace);
		IProject project = workspace.getRoot().getProject(getClass().getName());
		project.create(null);
		project.open(null);
		IFile file = project.getFile(pathKey);
		String fullPath = file.getFullPath().toPortableString();
		props.put(EclipseResourcesApi.EclipseResourcesInitializer.Properties.PHYSICAL, fullPath);

		// Call & verify
		EclipseResourcesInitializer initializer = (EclipseResourcesInitializer) configurationHelper(new Class[] {EclipseResourcesInitializer.class, ResourceInitializer.class}, EclipseResourcesApi.EclipseResourcesInitializer.Component.CONFIG_PID, props, timeout);
		assertNotNull(initializer);
	}

}
