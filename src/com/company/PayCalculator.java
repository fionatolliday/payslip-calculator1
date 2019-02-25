package com.company;

public class PayCalculator {

//    Declare the variables
    public final String employeePayPeriod;
    public final int employeeGrossIncome;
    public final int employeeIncomeTax;
    public final int employeeNetIncome;
    public final int employeeSuper;

//    Define a method to calculate pay period
    public String payPeriod(String startDate, String endDate){
        return startDate + "-" + endDate;
    }
//    Define a method to calculate gross income
    public int grossIncome(int annualSalary){
        return annualSalary/12;
    }

    //    Define a method to calculate income tax
    public int incomeTax (int annualSalary) {
//        requires an if statement to ensure get the correct tax on corrosponding income bracket
        if (annualSalary <= 18200) {
            return 0;
        } else if (annualSalary >=18201 && annualSalary <= 37000){
            double secondBracket=((grossIncome(annualSalary) - 18200) * (0.19)) / 12;
            return (int)Math.round(secondBracket);
        } else if (annualSalary >=37001 && annualSalary <= 87000){
            double thirdBracket=(3572 + (grossIncome(annualSalary) - 37000) * (0.325)) / 12;
            return (int)Math.round(thirdBracket);
        } else if (annualSalary >=87001 && annualSalary <= 180000){
             double fourthBracket=(19822 + (grossIncome(annualSalary) - 87000) * (0.37)) / 12;
            return (int)Math.round(fourthBracket);
        } else if (annualSalary >= 180000){
            double fifthBracket=(54232 + (grossIncome(annualSalary) - 180000) * (0.45)) / 12;
            return (int)Math.round(fifthBracket);
        }
        return annualSalary;
    }



//    Define a method to calculate net income
    public int netIncome (int annualSalary){
       return grossIncome(annualSalary) - incomeTax(annualSalary);
    }

//    Define a method to calculate super
    public int superannuation (int annualSalary, int superRate){
        double superNotRounded=(grossIncome(annualSalary) * superRate)/100;
        return (int)Math.round(superNotRounded);
    }


//    construct pay instance/object
    public PayCalculator (String startDate, String endDate, int annualSalary, int superRate){
        this.employeePayPeriod = payPeriod(startDate, endDate);
        this.employeeGrossIncome = grossIncome(annualSalary);
        this.employeeIncomeTax = incomeTax(annualSalary);
        this.employeeNetIncome = netIncome(annualSalary);
        this.employeeSuper = superannuation(annualSalary, superRate);
    }
}
