package com.mits.transUnion.java_assignment.utility;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;


public class StreamOperationsTest {
	
	  @Test
	    public void testSquareNumbers() {
	        StreamOperations operations = new StreamOperations();
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        List<Integer> expectedSquares = Arrays.asList(1, 4, 9, 16, 25);
	        List<Integer> actualSquares = operations.squareNumbers(numbers);

	        assertEquals(expectedSquares, actualSquares);
	    }

	    @Test
	    public void testSquareEvenNumbers() {
	        StreamOperations operations = new StreamOperations();
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

	        List<Integer> expectedSquares = Arrays.asList(4, 16, 36);
	        List<Integer> actualSquares = operations.squareEvenNumbers(numbers);

	        assertEquals(expectedSquares, actualSquares);
	    }
	    

}
