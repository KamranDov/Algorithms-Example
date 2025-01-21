package HackerRank.Java;

import java.util.Scanner;

public class Java_String_Reverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        scanner.close();

        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(input.equals(reversed) ? "Yes" : "No");

    }
}