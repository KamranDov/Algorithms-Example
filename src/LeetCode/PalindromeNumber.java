package LeetCode;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(int num) {
        if (num < 0){
            return false;
        }
        int reversedNumber = 0;
        int remainder = 0;
        int currentNumber = num;

        while (num != 0) {
            remainder = num % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            num = num / 10;
        }


        return currentNumber == reversedNumber;
    }
}

/*public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int number = x;
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        return x == reverse;
    }*/