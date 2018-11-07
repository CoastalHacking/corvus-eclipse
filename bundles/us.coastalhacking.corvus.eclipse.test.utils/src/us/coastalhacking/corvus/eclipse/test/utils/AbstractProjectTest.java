package us.coastalhacking.corvus.eclipse.test.utils;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.osgi.framework.FrameworkUtil;

public class AbstractProjectTest extends AbstractCMTest {

	public AbstractProjectTest() throws Exception {
		super();
	}

	protected static IWorkspace workspace;
	protected IProject project;

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
	
	protected IFile createFile(String name, String content) throws Exception {
		final IFile file = project.getFile(name);
		file.create(new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8)), IResource.FORCE, null);
		return file;
	}
}
