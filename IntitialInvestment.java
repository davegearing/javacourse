package chapter4;

import java.util.Scanner;

public class IntitialInvestment {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        /*
        ask the client how much they have to invest
        the bank only takes clients on with assets in excess
        of 1 million
         */

        int requiredInvestment = 1000000;
        int zero = 0;

        System.out.println("What is the total value of your assets? ");
        double clientAssets = scanner.nextDouble();

        while(clientAssets < requiredInvestment && clientAssets != zero){
            System.out.println("The bank can only onboard if assets exceed " + requiredInvestment);
            System.out.println("Please re-enter the asset total, enter " + zero + " to quit");
            clientAssets = scanner.nextDouble();
        }

        if(clientAssets != zero){
            System.out.println("Welcome onboard!");
        }
        else {
            System.out.println("Please come back if your situation changes");
        }
    }
}
