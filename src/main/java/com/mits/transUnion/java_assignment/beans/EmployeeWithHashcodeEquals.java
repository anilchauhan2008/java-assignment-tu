package com.mits.transUnion.java_assignment.beans;

public class EmployeeWithHashcodeEquals  implements Comparable<EmployeeWithHashcodeEquals> {
    private int id;
    private String firstName;
    private String lastName;

    public EmployeeWithHashcodeEquals(int id, String firstName, String lastName) {
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
    public int hashCode() {
        int result = Integer.hashCode(id);
        result =result + firstName.hashCode();
        result =result + lastName.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        EmployeeWithHashcodeEquals employee = (EmployeeWithHashcodeEquals) obj;

        return id == employee.id &&
               firstName.equals(employee.firstName) &&
               lastName.equals(employee.lastName);
    }
    
    
    @Override
    public int compareTo(EmployeeWithHashcodeEquals other) {
        return Integer.compare(this.id, other.id); 
    }

    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               '}';
    }
    
    

}
