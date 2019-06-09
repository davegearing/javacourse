package chapter2;

import java.util.Scanner;

class Coffee {

        public static void main(String[] arg) {

            Scanner scanner = new Scanner(System.in);
            int maxCups = 5;
            int borderlineAddict = 3;

            //what season is it
            System.out.println("What season is it? ");
            String season = scanner.next();

            //what is the day like
            System.out.println("What is the day like? ");
            String dayAdjective = scanner.next();

            //how much coffee
            System.out.println("How many cups of coffee do you drink? ");
            int cups = scanner.nextInt();

            scanner.close();

            System.out.println("On a " + dayAdjective + " " + season + " day I drink at least " + cups + " cups of coffee");
            /*
             code for chapter 3a, if statements
            */
            if (cups > maxCups) {
                System.out.println("That's too much coffee!!");
            }
            /*
            code for chapter 3b if else
             */
            if (cups <= borderlineAddict) {
                int headroom = borderlineAddict - cups;
                String cupWord = "cup";
                if(headroom > 1){
                    cupWord = "cups";
                }
                System.out.println("You should look to cut down your coffee quota");
                System.out.println("Drink another " + headroom + " " + cupWord + " and that is too many");
            }
            else {
                if (cups < maxCups) {
                    //ok
                    System.out.println("Your coffee consumption is ok");
                }
                else{
                    System.out.println("Your coffee consumption is NOT ok");
                    }
                }
            }
        }
