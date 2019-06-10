package chapter4;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String arg []){
        Scanner scanner = new Scanner(System.in);

        /*
        define variables
        define the string to do again
         */
        String answer;
        boolean again;
        double firstNumber;
        double secondNumber;
        double sum;
        String rightAnswer = "Y";

        do{
            System.out.println("first number ");
            firstNumber = scanner.nextDouble();

            System.out.println("second number ");
            secondNumber = scanner.nextDouble();

            sum = firstNumber + secondNumber;

            System.out.println("Sum is " + sum);

            System.out.println("again Y?");
            answer = scanner.next();

            again = (answer.equalsIgnoreCase(rightAnswer));
        }while (again);


    }
}
