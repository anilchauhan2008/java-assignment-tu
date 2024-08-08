package com.mits.transUnion.java_assignment.utility;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;
import org.mockito.Mockito;

public class ResourceHandlerTest {
	
	 @Test
	    public void testResourceClosure() throws IOException {
	        // mock BufferedReader
	        BufferedReader mockReader = Mockito.mock(BufferedReader.class);

	        when(mockReader.readLine()).thenReturn("Line 1").thenReturn(null);

	        ResourceHandler handler = new ResourceHandler();

	        handler.readResource(mockReader);
	        
	        verify(mockReader, times(2)).readLine();

	        verify(mockReader, times(1)).close();
	    }

}
