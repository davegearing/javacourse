package chapter6;

public class BillCalculator {

    public static void main(String[] args ){

        /*
        default constructor
         */
        PhoneBillTwo theBill = new PhoneBillTwo();
        theBill.itemisedBill();

        /*
        bill id only constructor
         */
        PhoneBillTwo theBill1 = new PhoneBillTwo("std");
        theBill1.itemisedBill();

        /*
        full constructor call, all defined
         */
        PhoneBillTwo theBill2 = new PhoneBillTwo("plan1", 35, 300, 450);
        theBill2.itemisedBill();
    }

}
