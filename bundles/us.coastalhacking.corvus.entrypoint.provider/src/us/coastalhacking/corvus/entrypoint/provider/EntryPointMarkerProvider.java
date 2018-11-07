package us.coastalhacking.corvus.entrypoint.provider;

import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import us.coastalhacking.corvus.eclipse.resources.BaseMarkerProvider;
import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesApi;
import us.coastalhacking.corvus.eclipse.resources.MarkerProvider;
import us.coastalhacking.corvus.entrypoint.EntryPointApi;

@Component(service=MarkerProvider.class, property={
		EclipseResourcesApi.MarkerProvider.Properties.KEY + "=" + EntryPointApi.MarkerProvider.Properties.KEY,
		EclipseResourcesApi.MarkerProvider.Properties.VALUE + "=" + EntryPointApi.MarkerProvider.Properties.VALUE
})
public class EntryPointMarkerProvider extends BaseMarkerProvider {

	@Activate
	void activate(Map<String, Object> props) {
		baseActivate(props);
	}
}
