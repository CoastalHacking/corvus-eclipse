package us.coastalhacking.corvus.eclipse.ui.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.concurrent.CompletableFuture;

import org.eclipse.core.resources.IResource;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.junit.jupiter.api.Test;

import us.coastalhacking.corvus.eclipse.resources.MarkerSupport.Coordinate;

class MarkerUiSupportBaseTest {

	public interface EditorResource extends IResource, IEditorInput {

	}

	@Test
	void shouldPopulateResource() throws Exception {

		// Mock & prep
		IEclipseContext context = mock(IEclipseContext.class);
		MarkerUiSupportBase base = new MarkerUiSupportBase() {
			@Override
			protected IEclipseContext getEclipseContext() {
				return context;
			}
		};
		EditorResource expected = mock(EditorResource.class);
		IEditorPart editor = mock(IEditorPart.class);
		when(editor.getEditorInput()).thenReturn(expected);
		IWorkbenchPage page = mock(IWorkbenchPage.class);
		when(page.getActiveEditor()).thenReturn(editor);
		IWorkbenchWindow window = mock(IWorkbenchWindow.class);
		when(window.getActivePage()).thenReturn(page);
		IWorkbench workbench = mock(IWorkbench.class);
		when(workbench.getActiveWorkbenchWindow()).thenReturn(window);
		when(context.get(IWorkbench.class)).thenReturn(workbench);
		final CompletableFuture<IResource> future = new CompletableFuture<>();

		// Call & verify
		base.populateResource(future);
		IResource actual = future.get();
		assertEquals(expected, actual);

	}

	@Test
	void shouldGetSelectedCoordinate() throws Exception {

		// Mock and Prep
		int charStart = 0;
		int length = 10;
		int startLine = 0;
		String expectedText = "Australian magpie";
		ITextSelection textSelection = mock(ITextSelection.class);
		when(textSelection.getOffset()).thenReturn(charStart);
		when(textSelection.getLength()).thenReturn(length);
		when(textSelection.getStartLine()).thenReturn(startLine);
		when(textSelection.getText()).thenReturn(expectedText);
		ESelectionService selectionService = mock(ESelectionService.class);
		when(selectionService.getSelection()).thenReturn(textSelection);
		IEclipseContext context = mock(IEclipseContext.class);
		when(context.get(ESelectionService.class)).thenReturn(selectionService);
		MarkerUiSupportBase base = new MarkerUiSupportBase() {
			@Override
			protected IEclipseContext getEclipseContext() {
				return context;
			}
		};

		// Call & verify
		Coordinate coordinate = base.getSelectedCoordinate().get();
		assertEquals(charStart, coordinate.charStart());
		assertEquals(charStart + length, coordinate.charEnd());
		assertEquals(startLine, coordinate.lineNumber());
		assertEquals(expectedText, coordinate.selected());
	}


/*
	@Disabled("Needs to run as itest")
	@Test
	void shouldRunResourceJob() throws Exception {

		@SuppressWarnings("unchecked")
		CompletableFuture<Void> future = mock(CompletableFuture.class);
		IResource resource = mock(IResource.class);
		IMarker marker = mock(IMarker.class);
		when(resource.createMarker(any())).thenReturn(marker);
		Coordinate coordinate = mock(Coordinate.class);

		int charStart = 0;
		int charEnd = 10;
		int lineNumber = 0;
		String selected = "Common raven";
		when(coordinate.charStart()).thenReturn(charStart);
		when(coordinate.charEnd()).thenReturn(charEnd);
		when(coordinate.lineNumber()).thenReturn(lineNumber);
		when(coordinate.selected()).thenReturn(selected);

		String markerId = "";
		MarkerUiSupportBase impl = new MarkerUiSupportBase();
		impl.id = "foo.bar";
		ResourceJob job = impl.new ResourceJob(future, markerId, resource, coordinate);
		job.runInWorkspace(null);

		verify(marker).setAttribute(IMarker.CHAR_START, charStart);
		verify(marker).setAttribute(IMarker.CHAR_END, charEnd);
		// 1 offset
		verify(marker).setAttribute(IMarker.LINE_NUMBER, lineNumber + 1);
		verify(marker).setAttribute(IMarker.MESSAGE, selected);
	}	
 */
	
}
