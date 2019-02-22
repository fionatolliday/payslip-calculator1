package com.company;

public class PayCalculator {

//    Declare the variables
    public final String employeePayPeriod;
    public final int employeeGrossIncome;



//    Define a method to calculate pay period
    public String payPeriod(String startDate, String endDate){
        return startDate + "-" + endDate;
    }
//    Define a method to calculate gross income
    public int grossIncome(int annualSalary){
        return annualSalary/12;
    }
//    Define a method to calculate income tax
    
//    Define a method to calculate net income
//    Define a method to calculate super


//    construct pay instance/object
    public PayCalculator (String startDate, String endDate, int annualSalary){
        this.employeePayPeriod = payPeriod(startDate, endDate);
        this.employeeGrossIncome = grossIncome(annualSalary);
    }
}
