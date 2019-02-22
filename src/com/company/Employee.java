package com.company;

public class Employee {

//Declare the variables
public final String employeeName;

//    Create a "fullName" method to join the first name with last name
    public String fullName(String firstName, String surname){
        return firstName + " " + surname;
    }


//    Construct a person instance
    public Employee(String firstName, String surname, int annualSalary, int superRate) {
        this.employeeName = fullName(firstName, surname);
    }

}
