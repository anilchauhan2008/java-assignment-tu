package com.mits.transUnion.java_assignment.utility;

import java.util.Comparator;

import com.mits.transUnion.java_assignment.beans.EmployeeWithHashcodeEquals;

public class FirstNameComparator  implements Comparator<EmployeeWithHashcodeEquals> {
    @Override
    public int compare(EmployeeWithHashcodeEquals e1, EmployeeWithHashcodeEquals e2) {
        return e1.getFirstName().compareTo(e2.getFirstName());
    }
}
