package HackerRank.Java;

import java.util.Scanner;

public class Java_String_Introduction {

    public static void main(String[] args) {

        String a = new Scanner(System.in).nextLine();
        String b = new Scanner(System.in).nextLine();

        int sizeCount = a.length() + b.length();
        System.out.println(sizeCount);

        String checkOrder = a.compareTo(b) > 0 ? "Yes" : "No";
        System.out.println(checkOrder);

        String aSubstring = a.substring(0, 1).toUpperCase() + a.substring(1);
        String bSubstring = b.substring(0, 1).toUpperCase() + b.substring(1);
        String result = aSubstring + " " + bSubstring;
        System.out.println(result);

    }
}