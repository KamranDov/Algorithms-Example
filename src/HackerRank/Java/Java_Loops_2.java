package HackerRank;

import java.util.Scanner;

public class Java_Loops_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            for (int k = 0; k < n; k++) {
                a = a + b;
                System.out.print(a + " ");
                b = b * 2;
            }
            System.out.println(" ");
        }

    }
}