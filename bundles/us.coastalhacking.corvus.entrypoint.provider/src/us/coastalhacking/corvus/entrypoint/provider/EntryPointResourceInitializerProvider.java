package us.coastalhacking.corvus.entrypoint.provider;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import us.coastalhacking.corvus.eclipse.transaction.BaseResourceInitializer;
import us.coastalhacking.corvus.eclipse.transaction.ResourceInitializer;
import us.coastalhacking.corvus.entrypoint.EntryPointApi;
import us.coastalhacking.corvus.entrypoint.EntrypointFactory;

@Component(service = ResourceInitializer.class, configurationPid=EntryPointApi.ResourceInitializer.Component.CONFIG_PID, configurationPolicy=ConfigurationPolicy.REQUIRE, immediate=true)
public class EntryPointResourceInitializerProvider extends BaseResourceInitializer {

	@Activate
	void activate(Map<String, Object> props) {
		baseActivate(props, EntryPointApi.ResourceInitializer.Properties.LOGICAL,
				EntryPointApi.ResourceInitializer.Properties.PHYSICAL);
	}

	@Override
	public EObject getRoot() {
		return EntrypointFactory.eINSTANCE.createEntryPointRoot();
	}
}
