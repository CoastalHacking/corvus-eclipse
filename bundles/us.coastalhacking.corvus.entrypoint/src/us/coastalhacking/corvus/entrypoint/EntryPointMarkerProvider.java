package us.coastalhacking.corvus.entrypoint;

import org.osgi.service.component.annotations.Component;

import us.coastalhacking.corvus.eclipse.resources.MarkerProvider;

@Component(service=MarkerProvider.class)
public class EntryPointMarkerProvider implements MarkerProvider {

	@Override
	public String getKey() {
		return EntryPointApi.MarkerProvider.KEY;
	}

	@Override
	public String getValue() {
		return EntryPointApi.MarkerProvider.VALUE;
	}

}
