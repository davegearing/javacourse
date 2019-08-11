package chapter5;

import java.util.Scanner;

public class PhoneBill {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
/*
we know the tax rate, 15%
we know the charge per minute over plan use, 0.25
 */
        double taxRate = 0.15;
        double overRate = 0.25;

        /*
        ask the user how much their plan costs
        and how many minutes over their plan they used
         */
        String prompt1 = "What is the Plan Cost";
        double planCost = getInput(prompt1);

        String prompt2 = "How many minutes over the plan did you use";
        double minutesOver = getInput(prompt2);

        scanner.close();

        /*
        do the calculations,
        minutes over * charge per minute
        plan cost + over minutes cost
        total cost * tax rate
        final cost
         */
        double overMinutesCost = doCalculation( minutesOver,  overRate);

        double totalCost = doSummation( planCost,  overMinutesCost);

        double taxAmount = doCalculation( totalCost,  taxRate);

        double allInCost = doSummation( totalCost,  taxAmount);

        /*
        tell the user the cost breakdown
         */
        String output1 = "Plan Cost : $" + planCost;
        printOutput(output1);

        String output2 = "Overage : $" + overMinutesCost;
        printOutput(output2);

        String output3 = "Tax : $" + taxAmount;
        printOutput(output3);

        String output4 = "Grand Total : $" + allInCost;
        printOutput(output4);
    }

    public static double getInput(String thePrompt){
        /*
        get input from the user
         */
        System.out.println(thePrompt + "? ");
        return scanner.nextDouble();
    }

    public static double doCalculation(double amount, double rate){
        /*
        calculate the multiplication, round to 2 decimal places
        most currencies have two decimals so this would suffice as
        a generic rounding rule, but if you want this to work for
        JPY/CHF you would have to adapt for specific currency
        based rules
         */

        double result = amount * rate;
        double roundedResult = Math.round(result * 100.0) / 100.0;
        return roundedResult;
    }

    public static double doSummation(double sum1, double sum2){
        /*
        sum the two values
         */
        double total = sum1 + sum2;
        return total;
    }

    public static void printOutput(String theOutput){
        /*
        display the output
         */
        System.out.println(theOutput);
    }
}
