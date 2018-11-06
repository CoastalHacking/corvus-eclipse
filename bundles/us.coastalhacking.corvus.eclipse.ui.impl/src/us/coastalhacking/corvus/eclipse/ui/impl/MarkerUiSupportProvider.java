package us.coastalhacking.corvus.eclipse.ui.impl;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import us.coastalhacking.corvus.eclipse.resources.MarkerSupport;
import us.coastalhacking.corvus.eclipse.ui.EclipseUiApi;
import us.coastalhacking.corvus.eclipse.ui.MarkerUiSupport;

@Component(service = MarkerUiSupport.class, configurationPid = EclipseUiApi.MarkerUiSupport.Component.CONFIG_PID)
public class MarkerUiSupportProvider extends MarkerUiSupportBase {

	@Reference
	IWorkbench workbench;

	@Reference
	MarkerSupport markerSupport;
	
	@Override
	protected IEclipseContext getEclipseContext() {
		return workbench.getApplication().getContext();
	}
	
	@Override
	protected MarkerSupport getMarkerSupport() {
		return markerSupport;
	}
}
