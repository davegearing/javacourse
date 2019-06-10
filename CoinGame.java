package chapter3;

import java.util.Scanner;

public class CoinGame {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        /*
        set the coin amounts and the total
         */
        int oneP = 1;
        int twoP = 2;
        int fiveP = 5;
        int tenP = 10;
        int twentyP = 20;
        int fiftyP = 50;
        int onePnd = 100;
        int total;
        int difference;
        int targetTotal = 100;

        /*
        ask the user how many of each coin type they have
        pennies, two pence, five pence, ten pence, twenty pence, fifty pence, one pound
         */

        System.out.println("How many penny coins do you have?");
        int pennies = scanner.nextInt();

        System.out.println("How many two penny coins do you have?");
        int tuppence = scanner.nextInt();

        System.out.println("How many five pence coins do you have?");
        int fivePence = scanner.nextInt();

        System.out.println("How many ten pence coins do you have?");
        int tenPence = scanner.nextInt();

        System.out.println("How many twenty pence coins do you have?");
        int twentyPence = scanner.nextInt();

        System.out.println("How many fifty pence coins do you have?");
        int fiftyPence = scanner.nextInt();

        System.out.println("How many one pound coins do you have?");
        int onePound = scanner.nextInt();

        scanner.close();

        /*
        now sum up all the coins they have and show the total
        show the win/lose if they have a pound or not
         */

        total = ((pennies * oneP) + (tuppence * twoP) + (fivePence * fiveP)
                + (tenPence * tenP) + (twentyPence * twentyP)
                + (fiftyPence * fiftyP) + (onePound * onePnd));

        if(total == targetTotal){
            System.out.println("You WIN! Total is " + total + " pence");
        }
        else{
            difference = total - targetTotal;
            if(difference > 0){
                System.out.println("You LOSE! You are " + difference + " pence over");
            }
            else{
                difference = difference * -1;
                System.out.println("You LOSE! You are " + difference + " pence under");
            }
        }

    }
}
