package com.mits.transUnion.java_assignment.beans;

import org.junit.Test;

import com.mits.transUnion.java_assignment.utility.FirstNameComparator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {
	
    @Test
    public void testWithoutHashCodeOrEquals() {
        Set<Employee> employees = new HashSet<>();

        Employee emp1 = new Employee(1, "Anil", "Chauhan");
        Employee emp2 = new Employee(1, "Anil", "Chauhan");

        employees.add(emp1);
        employees.add(emp2);

        assertEquals(2, employees.size());
    }
    
    
    
    @Test
    public void testWithOnlyHashCode() {
        Set<EmployeeWithHashcode> employees = new HashSet<>();

        EmployeeWithHashcode emp1 = new EmployeeWithHashcode(1, "Anil", "Chauhan");
        EmployeeWithHashcode emp2 = new EmployeeWithHashcode(1, "Anil", "Chauhan");

        employees.add(emp1);
        employees.add(emp2);
        
        assertEquals(2, employees.size());
    }
    
    
    @Test
    public void testWithOnlyEquals() {
        Set<EmployeeWithEquals> employees = new HashSet<>();

        EmployeeWithEquals emp1 = new EmployeeWithEquals(1, "Anil", "Chauhan");
        EmployeeWithEquals emp2 = new EmployeeWithEquals(1, "Anil", "Chauhan");

        employees.add(emp1);
        employees.add(emp2);

        assertEquals(2, employees.size());
    }
    
    
    

    @Test
    public void testWithHashCodeAndEquals() {
        Set<EmployeeWithHashcodeEquals> employees = new HashSet<>();

        EmployeeWithHashcodeEquals emp1 = new EmployeeWithHashcodeEquals(1, "Anil", "Chauhan");
        EmployeeWithHashcodeEquals emp2 = new EmployeeWithHashcodeEquals(1, "Anil", "Chauhan");

        employees.add(emp1);
        employees.add(emp2);

        assertEquals(1, employees.size());
    }
    
    
    
    
    

    @Test
    public void testDefaultSorting() {
        Set<EmployeeWithHashcodeEquals> employees = new TreeSet<>();

        employees.add(new EmployeeWithHashcodeEquals(3, "Abhishek", "Yadav"));
        employees.add(new EmployeeWithHashcodeEquals(1, "Ajay", "Chauhan"));
        employees.add(new EmployeeWithHashcodeEquals(2, "Anil", "Chauhan"));

        EmployeeWithHashcodeEquals[] expected = {
            new EmployeeWithHashcodeEquals(1,"Ajay", "Chauhan"),
            new EmployeeWithHashcodeEquals(2,"Anil", "Chauhan"),
            new EmployeeWithHashcodeEquals(3,"Abhishek", "Yadav")
        };

        assertArrayEquals(expected, employees.toArray());
    }
    
    
    

    @Test
    public void testCustomSortingByFirstName() {
        Set<EmployeeWithHashcodeEquals> employees = new TreeSet<>(new FirstNameComparator());

        employees.add(new EmployeeWithHashcodeEquals(3, "Abhishek", "Yadav"));
        employees.add(new EmployeeWithHashcodeEquals(1, "Ajay", "Chauhan"));
        employees.add(new EmployeeWithHashcodeEquals(2, "Anil", "Chauhan"));

        EmployeeWithHashcodeEquals[] expected = {
            new EmployeeWithHashcodeEquals(3,"Abhishek", "Yadav"),
            new EmployeeWithHashcodeEquals(1, "Ajay", "Chauhan"),
            new EmployeeWithHashcodeEquals(2, "Anil", "Chauhan")
        };

        assertArrayEquals(expected, employees.toArray());
    }
    
    

}
