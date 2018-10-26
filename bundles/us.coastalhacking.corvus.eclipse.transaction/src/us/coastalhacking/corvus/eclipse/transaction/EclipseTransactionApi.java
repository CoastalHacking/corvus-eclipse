package us.coastalhacking.corvus.eclipse.transaction;

public interface EclipseTransactionApi {

	interface TransactionalEditingDomain {
		@Deprecated
		String ID = "corvus.transaction.id";
		
		interface Properties {
			String ID = "corvus.transaction.id";
		}
	}

	interface CorvusTransactionalFactory {
		interface Component {
			String CONFIG_PID = "corvus.transaction.factory";
		}

		interface Reference {
			String INITIALIZERS = "corvus.transaction.initializers";
			String INITIALIZERS_TARGET = INITIALIZERS + ".target";
		}
	}

	interface CorvusTransactionalRegistry {
		interface Component {
			String CONFIG_PID = "corvus.transaction.registry";
		}
		
		interface Reference {
			String FACTORY = "corvus.transaction.registry.factory";
			String FACTORY_TARGET = FACTORY + ".target";
		}
	}
	
	@Deprecated
	interface Properties {
		String CORVUS_TRANSACTION_ID = "corvus.transaction.id";
	}
}
