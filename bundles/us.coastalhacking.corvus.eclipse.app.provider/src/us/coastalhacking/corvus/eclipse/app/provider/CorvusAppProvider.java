package us.coastalhacking.corvus.eclipse.app.provider;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import org.osgi.service.cm.Configuration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import us.coastalhacking.corvus.eclipse.app.CorvusApp;
import us.coastalhacking.corvus.eclipse.app.CorvusAppApi;
import us.coastalhacking.corvus.entrypoint.EntryPointApi;
import us.coastalhacking.corvus.osgi.utils.ConfigurationAdminHelper;

@Component(service = CorvusApp.class, factory = CorvusAppApi.CorvusApp.Component.FACTORY)
public class CorvusAppProvider implements CorvusApp {

	protected final List<Configuration> configurations = new CopyOnWriteArrayList<>();

	@Reference
	ConfigurationAdminHelper helper;

	private String transactionId;

	@Activate
	void activate(Map<String, Object> oldProps) throws Exception {
		Hashtable<String, Object> newProps = new Hashtable<>(oldProps);
		// Create a target filter and apply to all things which should be targeted
		transactionId = (String) newProps.get(CorvusAppApi.TransactionalEditingDomain.Properties.ID);
		String[] targets = { CorvusAppApi.CorvusTransactionalFactory.Reference.INITIALIZERS,
				CorvusAppApi.EclipseResourcesChangeListener.Reference.REGISTRY,
				CorvusAppApi.ResourceModifiedListener.Reference.REGISTRY };
		helper.target(newProps, Arrays.stream(targets).sequential(),
				CorvusAppApi.TransactionalEditingDomain.Properties.ID, transactionId);

		// Ordered
		String[] pids = { EntryPointApi.ResourceInitializer.Component.CONFIG_PID,
				CorvusAppApi.EclipseResourcesInitializer.Component.CONFIG_PID,
				CorvusAppApi.CorvusTransactionalFactory.Component.CONFIG_PID,
				CorvusAppApi.CorvusTransactionalRegistry.Component.CONFIG_PID,
				CorvusAppApi.ResourceModifiedListener.Component.CONFIG_PID,
				CorvusAppApi.EclipseResourcesChangeListener.Component.CONFIG_PID };
		configurePids(helper, pids, newProps, configurations);

//		helper.configure(EntryPointApi.ResourceInitializer.Component.CONFIG_PID, newProps, configurations);
//		helper.configure(CorvusAppApi.EclipseResourcesInitializer.Component.CONFIG_PID, newProps, configurations);
//		helper.configure(CorvusAppApi.CorvusTransactionalFactory.Component.CONFIG_PID, newProps, configurations);
//		helper.configure(CorvusAppApi.CorvusTransactionalRegistry.Component.CONFIG_PID, newProps, configurations);
//		helper.configure(CorvusAppApi.ResourceModifiedListener.Component.CONFIG_PID, newProps, configurations);
//		helper.configure(CorvusAppApi.EclipseResourcesChangeListener.Component.CONFIG_PID, newProps, configurations);
	}

	void configurePids(ConfigurationAdminHelper helper, String[] pids, Hashtable<String, Object> props,
			List<Configuration> configurations) {
		Arrays.stream(pids).forEach(pid -> {
			try {
				helper.configure(pid, props, configurations);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

	@Deactivate
	void deactivate() {
		helper.deactivateConfigurations(configurations);
	}

}
