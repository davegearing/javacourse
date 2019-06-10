package chapter3;

import java.util.Scanner;

public class Loan {

    public static void main(String [] arg){
        Scanner scanner = new Scanner(System.in);

        int salaryRequired = 30000;
        int monthsRequired = 24;

        /*
        what is the employee salary
         */
        System.out.println("What is your salary? ");
        Double salary = scanner.nextDouble();

        if(salary >= salaryRequired) {
            /*
            how long has the employee worked in their current job
             */
            System.out.println("How many months have you worked in your current job? ");
            int monthsWorked = scanner.nextInt();

            if (monthsWorked >= monthsRequired) {
                System.out.println("Ok, you can have the loan");
            } else {
                System.out.println("Sorry, you have not worked long enough in your current job,"
                        + " you need to have worked for " + monthsRequired + " months");
            }
        }
        else{
            System.out.println("Sorry, you do not earn enough, "
            + "the minimum salary is £" + salaryRequired);
        }

        scanner.close();
    }


}
