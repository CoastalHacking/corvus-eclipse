package us.coastalhacking.corvus.emf;

public interface EmfApi {
	
	interface IEditingDomainProvider {
		interface Component {
			String CONFIG_PID = "corvus.emf.domainprovider";
		}
		interface Reference {
			String RESOURCE_SET_LISTENERS = "corvus.emf.domainprovider.rsl";
			String INITIALIZERS = "corvus.emf.domainprovider.initializers";
		}
	}

	interface Registry {
		interface Component {
			String CONFIG_PID = "corvus.emf.registry";
		}

		interface Reference {
			String NAME = "corvus.emf.registry";
		}
	}
	
	interface Factory {
		
	}
	
	interface TransactionalEditingDomain {
		interface Properties {
			String ID = "corvus.emf.id";
		}
	}

	interface ResourceInitializer {
		interface Properties {
			String LOGICAL = "corvus.emf.initializer.logical";
			String PHYSICAL = "corvus.emf.initializer.physical";
			@Deprecated
			String PROJECT = "corvus.emf.initializer.project";
		}
		
		interface EclipseResources {
			interface Properties {
				String LOGICAL = "corvus:eclipse";
				String PHYSICAL = "eclipse.semiotics";
			}
		}
		
		interface EntryPoint {
			interface Properties {
				String LOGICAL = "corvus:entrypoint";
				String PHYSICAL = "entrypoint.semiotics";
			}
		}
	}
	
	interface CorvusTransactionalFactory {
		interface Component {
			String CONFIG_PID = "corvus.emf.factory";
		}

		@Deprecated
		interface Reference {
			String INITIALIZERS = EmfApi.IEditingDomainProvider.Reference.INITIALIZERS;
		}
	}
	
	@Deprecated
	interface CorvusTransactionalRegistry {
		@Deprecated
		interface Component {
			String CONFIG_PID = Registry.Component.CONFIG_PID;
		}
		@Deprecated
		interface Reference {
			String FACTORY = "corvus.emf.registry.factory";
			String NAME = Registry.Reference.NAME;
		}
	}

	interface ResourceModifiedListener {
		interface Component {
			String CONFIG_PID = "corvus.emf.resourcemodified";
		}

		interface Reference {
			@Deprecated
			String REGISTRY = "corvus.emf.resourcemodified.registry";
		}
	}

}
