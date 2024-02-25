package HackerRank.Java;

import java.util.Scanner;

public class Java_Int_To_String {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int value = scanner.nextInt();

            String str = Integer.toString(value);

            if (value == Integer.parseInt(str))
                System.out.println("Good job");
            else System.out.println("Wrong answer.");
        }
    }
}
