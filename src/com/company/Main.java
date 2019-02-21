package com.company;
//	create an Employee class
//  create a PayCalculator

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InputStream input = System.in;
        Scanner readInput = new Scanner(input);

//        Output welcome message.
        System.out.println("Welcome to the payslip generator!");
        //Ask for name input
        System.out.println("Please input your name: ");
//        get input from user
        String firstName = readInput.nextLine();
//        Ask for surname input
        System.out.println("Please input your surname: ");
//        get input from user
        String surname = readInput.nextLine();
//        ask for annual salary
        System.out.println("Please enter your annual salary: ");
//        get input from user
        int annualSalary = Integer.parseInt(readInput.nextLine());
//        ask for super rate
        System.out.println("Please enter your super rate: ");
//        get input from user
        int superRate = Integer.parseInt(readInput.nextLine());
//        ask for payment start date
        System.out.println("Please enter your payment start date: ");
//        get input from user
        String startDate = readInput.nextLine();
//        ask for payment end date
        System.out.println("Please enter your payment end date: ");
//        get input from user
        String endDate = readInput.nextLine();
        //        get input from user
        System.out.println("Your payslip has been generated:");

        //        generate message to say "Your payslip has been generated:

//        output name (first name + surname)
//        output pay period (from and to)
//        output gross income
//        output income tax
//        output net income
//        output super

//        generate message to say "Thank you for using MYOB!"
    }
}

