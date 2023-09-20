package HackerRank.Java;

import java.util.Scanner;

public class Java_Stdin_and_Stdout_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputInt = scanner.nextInt();
        double inputDouble = scanner.nextDouble();
        scanner.nextLine();
        String inputString = scanner.nextLine();

        System.out.println("String: " + inputString);
        System.out.println("Double: " + inputDouble);
        System.out.println("Int: " + inputInt);
    }
}
