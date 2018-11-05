package us.coastalhacking.corvus.eclipse.resources.provider;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.osgi.framework.FrameworkUtil;

import us.coastalhacking.corvus.eclipse.test.utils.AbstractCMTest;
import us.coastalhacking.corvus.eclipse.test.utils.TestUtils;

class AbstractProjectTest extends AbstractCMTest {

	public AbstractProjectTest() throws Exception {
		super();
	}

	protected static IWorkspace workspace;
	IProject project;

	@BeforeAll
	protected static void beforeAll() throws Exception {
		workspace = TestUtils.getService(FrameworkUtil.getBundle(AbstractProjectTest.class).getBundleContext(), IWorkspace.class, 200);
	}
	
	@BeforeEach
	protected void beforeEach() throws Exception {
		project = workspace.getRoot().getProject(getClass().getName());
		project.create(null);
		project.open(null);
	}

	@AfterEach
	protected void afterEach() throws Exception {
		project.delete(true, null);
	}
}
