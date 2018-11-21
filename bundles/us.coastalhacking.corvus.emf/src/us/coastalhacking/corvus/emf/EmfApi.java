package us.coastalhacking.corvus.emf;

public interface EmfApi {
	
	interface ResourceSetListener {
		interface Properties {
			String ID = "corvus.emf.rsl";
		}
	}

	interface IEditingDomainProvider {
		interface Component {
			String CONFIG_PID = "corvus.emf.iedp";
		}
		interface Reference {
			// Use ResourceSetListener.Ref... NAME
			@Deprecated
			String RESOURCE_SET_LISTENERS = EmfApi.IEditingDomainProvider.Component.CONFIG_PID + ".rsl";
			// Use ResourceInitializer.Refe.. NAME
			@Deprecated
			String INITIALIZERS = EmfApi.IEditingDomainProvider.Component.CONFIG_PID  + ".initializers";
			String NAME = EmfApi.IEditingDomainProvider.Component.CONFIG_PID  + ".name";
		}
	}

	interface Registry {
		interface Component {
			String CONFIG_PID = "corvus.emf.registry";
		}

		interface Reference {
			String NAME = Registry.Component.CONFIG_PID + ".name";
		}
	}
	
	interface Factory {
		interface Component {
			String CONFIG_PID = "corvus.emf.factory";
		}

		interface Reference {
			String NAME = Factory.Component.CONFIG_PID + ".name";
		}
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

	interface ResourceModifiedListener {
		interface Component {
			String CONFIG_PID = "corvus.emf.resourcemodified";
		}
	}

}
