package com.company;
//	create an Employee class
//  create a PayCalculator

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InputStream input = System.in;
        Scanner readInput = new Scanner(input);

//        ASK QUESTIONS AND GAIN THE DATA INPUT
        System.out.println("Welcome to the payslip generator!" + "\n");

        System.out.println("Please input your name: ");
        String firstName = readInput.nextLine();

        System.out.println("Please input your surname: ");
        String surname = readInput.nextLine();

        System.out.println("Please enter your annual salary: ");
        int annualSalary = Integer.parseInt(readInput.nextLine());

        System.out.println("Please enter your super rate: ");
        int superRate = Integer.parseInt(readInput.nextLine());

        System.out.println("Please enter your payment start date: ");
        String startDate = readInput.nextLine();

        System.out.println("Please enter your payment end date: ");
        String endDate = readInput.nextLine();


        System.out.println("Your payslip has been generated: ");

//        COMPLETE OBJECT TO USE TO PRINT TO SCREEN
        Employee employee1 = new Employee(firstName, surname, annualSalary, superRate);
        PayCalculator pay1 = new PayCalculator(startDate, endDate, annualSalary);


//      OUTPUT TO SCREEN THE GENERATED PAYSLIP DETAILS
        System.out.println("Name: " + employee1.employeeName);
//        output pay period (from and to)
        System.out.println("Pay Period: " + pay1.payPeriod(startDate, endDate));
//        output gross income
        System.out.print("Gross Income: " + pay1.grossIncome(annualSalary));
//        output income tax
//        output net income
//        output super

//        generate message to say "Thank you for using MYOB!"
    }
}

