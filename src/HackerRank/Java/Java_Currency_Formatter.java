package HackerRank.Java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Java_Currency_Formatter {

    public static void main(String[] args) {

        //If this code causes problem in hackerrank, if you have selected hackerrank java version 15 then make java version 8 and run then it will work normally

        try (Scanner scan = new Scanner(System.in)) {
            double paymentAmount = scan.nextDouble();
            System.out.println("default payment: " + paymentAmount);

            String formattedUSPayment = formatCurrency(Locale.US, paymentAmount);
            System.out.println("US: " + formattedUSPayment);

            Locale indiaLocale = new Locale("en", "in");
            String formattedIndiaPayment = formatCurrency(indiaLocale, paymentAmount);
            System.out.println("India: " + formattedIndiaPayment);

            String formattedChinaPayment = formatCurrency(Locale.CHINA, paymentAmount);
            System.out.println("China: " + formattedChinaPayment);

            String formattedFrancePayment = formatCurrency(Locale.FRANCE, paymentAmount);
            System.out.println("France: " + formattedFrancePayment);
        }
    }

    public static String formatCurrency(Locale locale, double amount) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(amount);

    }
}
