package HackerRank.Java;

import java.util.Arrays;
import java.util.Scanner;

public class Java_Anagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        if (isAnagram(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    public static boolean isAnagram(String a, String b) {

        String A = a.toLowerCase();
        String B = b.toLowerCase();

        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);

        return Arrays.equals(charA, charB);
    }
}
