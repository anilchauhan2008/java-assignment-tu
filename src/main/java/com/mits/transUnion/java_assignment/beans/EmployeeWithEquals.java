package com.mits.transUnion.java_assignment.beans;

public class EmployeeWithEquals {

	  private int id;
	    private String firstName;
	    private String lastName;

	    public EmployeeWithEquals(int id, String firstName, String lastName) {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	    }

	    // Getters and setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;

	        EmployeeWithEquals employee = (EmployeeWithEquals) obj;

	        return id == employee.id &&
	               firstName.equals(employee.firstName) &&
	               lastName.equals(employee.lastName);
	    }
}
