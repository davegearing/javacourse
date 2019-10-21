package chapter7;

import java.util.Scanner;

public class Weekday {

    public static final String WEEKDAY[] = {"Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday" , "Sunday"};

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("what day number (1 to 7)? ");
        int dayNumber = scanner.nextInt();
        if(dayNumber >= 1 && dayNumber <=7){
            int pos = dayNumber - 1;
            System.out.println("Day is " + WEEKDAY[pos]);
        }
        else{
            System.out.println("Error: must be between 1 and 7");
        }

        scanner.close();

    }
}
