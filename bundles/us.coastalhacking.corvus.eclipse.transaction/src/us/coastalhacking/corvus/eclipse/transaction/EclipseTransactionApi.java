package us.coastalhacking.corvus.eclipse.transaction;

public interface EclipseTransactionApi {

	interface TransactionalEditingDomain {
		String ID = "corvus.transaction.id";		
	}

	@Deprecated
	interface Properties {
		String CORVUS_TRANSACTION_ID = "corvus.transaction.id";
	}
}
