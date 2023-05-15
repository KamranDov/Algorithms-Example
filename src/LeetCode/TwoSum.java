package LeetCode;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int k = i + 1; k < numbers.length; k++) {
                if (numbers[i] + numbers[k] == target) {
                    result[0] = i + 1;
                    result[1] = k + 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{6, 8, 11, 7}, 14)));

    }
}
