package com.mits.transUnion.java_assignment.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {
	
    // Method to calculate square of each number in the list
	public List<Integer> squareNumbers(List<Integer> numbers) {
		return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
	}
	
	
    // Method to calculate square of even numbers in the list
    public List<Integer> squareEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                      .filter(n -> n % 2 == 0)
                      .map(n -> n * n)
                      .collect(Collectors.toList());
    }
    
    
    public void readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
