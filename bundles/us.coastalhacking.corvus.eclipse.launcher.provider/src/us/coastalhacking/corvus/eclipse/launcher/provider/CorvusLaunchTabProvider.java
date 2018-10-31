package us.coastalhacking.corvus.eclipse.launcher.provider;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import us.coastalhacking.corvus.eclipse.launcher.CorvusLaunchApi;
import us.coastalhacking.corvus.eclipse.launcher.CorvusLaunchTab;
import us.coastalhacking.corvus.eclipse.launcher.CorvusTab;

@Component(service=CorvusLaunchTab.class, factory=CorvusLaunchApi.CorvusLaunchTab.Component.FACTORY)
public class CorvusLaunchTabProvider extends AbstractLaunchConfigurationTabGroup implements CorvusLaunchTab {

	@Reference
	CorvusTab corvusTab;
	
	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
        setTabs(new ILaunchConfigurationTab[] {corvusTab, new CommonTab()});		
	}

}
