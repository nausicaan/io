import java.util.Scanner;

public class Problem2
{
    public void run()
    {
        //Variable declaration
        Scanner kb = new Scanner(System.in);
        final double GOVRATE = -0.15;
        final double PERS_RATE = -0.10;
        final double PENS_RATE = -0.05;
        double hoursWorked;
        double payRate;
        double grossPay;
        double governmentDeduction;
        double personalDeduction;
        double pensionContribution;
        double totalDeductions;
        double netPay;


        //Prompt for user imput
        System.out.println("\nHow many hours have you worked during this pay period?");
        hoursWorked = kb.nextDouble();
        System.out.println("What is your rate of pay per hour?");
        payRate = kb.nextDouble();
        
        
        //Calculations
        grossPay = hoursWorked * payRate;
        governmentDeduction = GOVRATE * grossPay;
        personalDeduction = PERS_RATE * grossPay;
        pensionContribution = PENS_RATE * (grossPay + personalDeduction);
        totalDeductions = governmentDeduction + personalDeduction + pensionContribution;
        netPay = grossPay + totalDeductions;
        
        
        //Output results to user
        System.out.format("%nNumber of Hours Worked: %8.1f%n", hoursWorked);
        System.out.format("Pay Rate per Hour: %13.1f%n", payRate);
        
        System.out.format("%nPayroll Report%n");
        System.out.format("   Gross Pay\t\t\t\t$%(,10.2f%n", grossPay);
        System.out.format("   Deductions:%n");
        System.out.format("\tGovernment\t$%(,9.2f%n", governmentDeduction);
        System.out.format("\tPersonal\t$%(,9.2f%n", personalDeduction);
        System.out.format("\tPension\t\t$%(,9.2f%n", pensionContribution);
        System.out.format("   Total Deductions\t\t\t$%(,11.2f%n", totalDeductions);
        System.out.format("   Net Pay\t\t\t\t$%(,10.2f%n", netPay);
    }
}
