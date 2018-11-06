package us.coastalhacking.corvus.eclipse.ui.impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.eclipse.e4.ui.workbench.IWorkbench;
import org.junit.jupiter.api.Test;

import us.coastalhacking.corvus.eclipse.resources.MarkerSupport;
import us.coastalhacking.corvus.eclipse.test.utils.AbstractCMTest;
import us.coastalhacking.corvus.eclipse.ui.MarkerUiSupport;

class MarkerUiSupportProviderTest extends AbstractCMTest {

	public MarkerUiSupportProviderTest() throws Exception {
		super();
	}

	@Test
	void shouldConfigure() throws Exception {
		// assert dependencies are available
		IWorkbench workbench = serviceTrackerHelper(IWorkbench.class);
		assertNotNull(workbench);
		MarkerSupport supportProvider = serviceTrackerHelper(MarkerSupport.class);
		assertNotNull(supportProvider);
		
		MarkerUiSupport uiProvider = serviceTrackerHelper(MarkerUiSupport.class);
		assertNotNull(uiProvider);
	}

}
