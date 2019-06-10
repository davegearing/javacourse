package chapter3;

import java.util.Locale;
import java.util.Scanner;

public class CcyNames {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String ccyName;

            /*
            ask for the currency code
            and convert to uppercase
             */
        System.out.println("Enter currency ISO code:");
        String ccy = scanner.next();
        ccy = ccy.toUpperCase(Locale.forLanguageTag(ccy));

        scanner.close();

        switch (ccy) {
            case "GBP":
                ccyName = "Pounds Sterling";
                break;

            case "USD":
                ccyName = "US Dollar";
                break;

            case "EUR":
                ccyName = "Euro";
                break;

            case "CAD":
                ccyName = "Canadian Dollar";
                break;

            case "AUD":
                ccyName = "Australian Dollar";
                break;

            case "CHF":
                ccyName = "Swiss Franc";
                break;

            default:
                ccyName = "Unknown Currency";
        }

        System.out.println(ccy + " " + ccyName);
    }
}
