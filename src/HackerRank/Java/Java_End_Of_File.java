package HackerRank.Java;

import java.util.Scanner;

public class Java_End_Of_File {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int nextLine = 1;
            while (sc.hasNext()) {
                System.out.println(nextLine + " " + sc.nextLine());
                nextLine++;
            }
        }
    }
}
