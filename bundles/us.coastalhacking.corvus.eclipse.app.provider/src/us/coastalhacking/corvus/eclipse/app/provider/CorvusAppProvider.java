package us.coastalhacking.corvus.eclipse.app.provider;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.owasp.prevent.ldap.LdapEscape;

import us.coastalhacking.corvus.eclipse.app.CorvusApp;
import us.coastalhacking.corvus.eclipse.app.CorvusAppApi;

@Component(service = CorvusApp.class, configurationPid = CorvusAppApi.CorvusApp.Component.CONFIG_PID, configurationPolicy = ConfigurationPolicy.REQUIRE)
public class CorvusAppProvider implements CorvusApp {

	protected final List<Configuration> configurations = new CopyOnWriteArrayList<>();

	@Reference
	ConfigurationAdmin configAdmin;

	private String transactionId;

	@Activate
	void activate(Map<String, Object> oldProps) throws Exception {

		Hashtable<String, Object> newProps = new Hashtable<>(oldProps);
		// Create a target filter and apply to all things which should be targeted
		transactionId = (String) newProps.get(CorvusAppApi.TransactionalEditingDomain.Properties.ID);
		String[] targets = { CorvusAppApi.CorvusTransactionalFactory.Reference.INITIALIZERS,
				CorvusAppApi.CorvusTransactionalRegistry.Reference.FACTORY,
				CorvusAppApi.EclipseResourcesChangeListener.Reference.REGISTRY };
		target(newProps, Arrays.stream(targets).sequential(), CorvusAppApi.TransactionalEditingDomain.Properties.ID,
				transactionId);

		// Then configure
		configure(CorvusAppApi.EclipseResourcesInitializer.Component.CONFIG_PID, newProps, configurations);
		configure(CorvusAppApi.CorvusTransactionalFactory.Component.CONFIG_PID, newProps, configurations);
		configure(CorvusAppApi.CorvusTransactionalRegistry.Component.CONFIG_PID, newProps, configurations);
		configure(CorvusAppApi.EclipseResourcesChangeListener.Component.CONFIG_PID, newProps, configurations);
	}

	@Deactivate
	void deactivate() {
		deactivateConfigurations(configurations);
	}

	void target(Map<String, Object> props, Stream<String> targets, String targetKey, String targetValue) {
		// "foo.target=(unescapedKey=escapedValue)"
		if (targets.isParallel()) {
			throw new RuntimeException("Unknown map type, parallel operations may be unsafe");
		}
		targets.forEach(target -> {
			props.put(target + ".target",
					String.format("(%s=%s)", targetKey, LdapEscape.escapeLDAPSearchFilter(targetValue)));
		});
	}

	void configure(String factoryPid, Map<String, Object> props, List<Configuration> configurations) throws Exception {
		final Configuration configuration = configAdmin.createFactoryConfiguration(factoryPid, "?");
		configurations.add(configuration);
		configuration.update(new Hashtable<>(props));
	}

	void deactivateConfigurations(List<Configuration> configurations) {
		configurations.forEach(c -> {
			try {
				c.delete();
			} catch (Exception e) {
				// TODO log
				e.printStackTrace();
			}
		});
	}

}
