package com.mits.transUnion.java_assignment.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceHandler {
	
    // Method to read lines from a BufferedReader and ensure it is closed
    public void readResource(BufferedReader reader) {
        try (BufferedReader br = reader) { // The resource is declared here
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
