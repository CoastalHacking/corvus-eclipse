package us.coastalhacking.corvus.osgi.utils;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.osgi.service.cm.Configuration;

public interface ConfigurationAdminHelper {

	public void target(Map<String, Object> props, Stream<String> targets, String targetKey, String targetValue);

	public void deactivateConfigurations(List<Configuration> configurations);

	public void configure(String factoryPid, Map<String, Object> props, List<Configuration> configurations)
			throws Exception;
}
