package HackerRank.Java;

import java.util.Scanner;

public class Java_Output_Formatting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {

            String s1 = sc.next();
            int x = sc.nextInt();

            String formattedOutput = String.format("%-15s%03d", s1, x);
            System.out.println(formattedOutput);
        }
        System.out.println("================================");

    }
}
