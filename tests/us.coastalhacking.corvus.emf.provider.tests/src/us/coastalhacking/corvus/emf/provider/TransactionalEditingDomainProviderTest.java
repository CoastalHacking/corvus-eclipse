package us.coastalhacking.corvus.emf.provider;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain.Factory;
import org.eclipse.emf.transaction.TransactionalEditingDomain.Registry;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import us.coastalhacking.corvus.emf.EmfApi;
import us.coastalhacking.corvus.emf.ResourceInitializer;
import us.coastalhacking.corvus.emf.TransactionIdUtil;
import us.coastalhacking.corvus.test.util.AbstractProjectTest;
import us.coastalhacking.corvus.test.util.UtilFactory;

class TransactionalEditingDomainProviderTest extends AbstractProjectTest {

	public TransactionalEditingDomainProviderTest() throws Exception {
		super();
	}
	
	TransactionalEditingDomainProvider provider;
	Map<String, Object> props;
	String transactionId;
	Factory factory;
	Registry registry;
	Registry mockRegistry;
	TransactionIdUtil idUtil;
	TransactionIdUtil mockIdUtil;
	URI projectUri;
	ResourceSetListener listener;
	ResourceInitializer initializer;
	TransactionalEditingDomain editingDomain;
	TransactionalCommandStack stack;
	String logical;
	String physical;
	EObject root;

	@BeforeEach
	protected void beforeEach() throws Exception {
		super.beforeEach();

		props = new HashMap<>();
		idUtil = serviceTrackerHelper(TransactionIdUtil.class);
		assertNotNull(idUtil);
		transactionId = idUtil.getId(project);
		projectUri = idUtil.getUri(transactionId);
		idUtil.putId(props, transactionId);
		props.put(EmfApi.ResourceInitializer.Properties.PROJECT, transactionId);
		factory = configurationHelper(Factory.class, EmfApi.CorvusTransactionalFactory.Component.CONFIG_PID, props, timeout);
		assertNotNull(factory);
		registry = configurationHelper(Registry.class, EmfApi.CorvusTransactionalRegistry.Component.CONFIG_PID, props, timeout);
		assertNotNull(registry);
		listener = mock(ResourceSetListener.class);
		stack = mock(TransactionalCommandStack.class);
		editingDomain = mock(TransactionalEditingDomain.class);
		when(editingDomain.getCommandStack()).thenReturn(stack);
		mockRegistry = mock(Registry.class);
		when(mockRegistry.getEditingDomain(transactionId)).thenReturn(editingDomain);
		
		initializer = mock(ResourceInitializer.class);
		logical = String.format("test:%s", getClass());
		physical = "test.semiotics";
		when(initializer.getLogical()).thenReturn(logical);
		when(initializer.getPhysical()).thenReturn(physical);
		root = UtilFactory.eINSTANCE.createTestRoot();
		when(initializer.getRoot()).thenReturn(root);
		
		provider = new TransactionalEditingDomainProvider();
		provider.editingDomain = editingDomain;
		provider.projectUri = projectUri;
		mockIdUtil = mock(TransactionIdUtil.class);
		provider.transactionIdUtil = mockIdUtil;
		provider.registry = mockRegistry;
		provider.transactionId = transactionId;
	}
	
	@Override
	@AfterEach
	protected void afterEach() throws Exception {
		super.afterEach();
		provider.registry = null;
		provider.transactionIdUtil = null;
		provider.editingDomain = null;
	}

	@Test
	void shouldConfigure() throws Exception {
		IEditingDomainProvider provider = configurationHelper(IEditingDomainProvider.class, EmfApi.IEditingDomainProvider.Component.CONFIG_PID, props, timeout);
		assertTrue(provider instanceof TransactionalEditingDomainProvider);
	}

	@Test
	void shouldSetResourceSetListeners() throws Exception {
		
		// Pre-activation case
		provider.setResourceSetListeners(listener);
		assertEquals(listener, provider.listeners.get(0));
		provider.listeners.clear();

		// Post-activation case
		provider.activated.set(true);
		provider.setResourceSetListeners(listener);
		verify(editingDomain, times(1)).addResourceSetListener(listener);
	}

	@Test
	void shouldUnsetResourceSetListeners() throws Exception {
		// Prep
		provider.listeners.add(listener);

		// Pre-activation case
		provider.unsetResourceSetListeners(listener);
		assertTrue(provider.listeners.isEmpty());

		// Post-activation case
		provider.activated.set(true);
		provider.unsetResourceSetListeners(listener);
		verify(editingDomain, times(1)).removeResourceSetListener(listener);
	}

	@Test
	void shouldSetInitializer() throws Exception {	
		// Pre-activation case
		provider.setInitializer(initializer);
		assertEquals(initializer, provider.initializers.get(0));
		provider.initializers.clear();

		// Post-activation case
		provider.activated.set(true);
		provider.setInitializer(initializer);
		verify(initializer, times(1)).getLogical();
		verify(initializer, times(1)).getPhysical();
		verify(initializer, times(1)).getRoot();
		verify(stack, times(1)).execute(any());
	}

	@Test
	void shouldUnsetInitializer() throws Exception {
		// Prep
		provider.initializers.add(initializer);
		
		// Pre-activation case
		// No post-activation case
		provider.unsetInitializer(initializer);;
		assertTrue(provider.initializers.isEmpty());
	}

	@Test
	void shouldActivate() throws Exception {
		// Prep
		provider.listeners.add(listener);
		provider.initializers.add(initializer);
		when(mockIdUtil.getId(props)).thenReturn(transactionId);
		when(mockIdUtil.getUri(transactionId)).thenReturn(projectUri);
		
		// Execute & verify
		provider.activate(props);
		
		// Verify
		assertTrue(provider.initializers.isEmpty());
		assertTrue(provider.listeners.isEmpty());
		verify(mockIdUtil, times(1)).getId(props);
		verify(mockIdUtil, times(1)).getUri(transactionId);
		verify(mockRegistry, times(1)).getEditingDomain(transactionId);
		verify(editingDomain, times(1)).addResourceSetListener(listener);
		verify(stack, times(1)).execute(any());
	}

	@Test
	void shouldDeactivate() throws Exception {
		provider.deactivate();
		verify(provider.registry, times(1)).remove(transactionId);
		verify(provider.editingDomain, times(1)).dispose();
		
		// Verify only called once
		provider.deactivate();
		verify(provider.registry, times(1)).remove(transactionId);
		verify(provider.editingDomain, times(1)).dispose();
	}

}
