package AlgorithmExamples;
//Basa dusmesen kodun nece isleyib 4 neticesini aldigini Debug ele basa duseceysen.
public class Example8 {
    public static int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int num : nums) {
            sum += num;

        }
        return (n * (n + 1)) / 2 - sum;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{0, 2, 3, 1, 5};
        System.out.println(missingNumber(arr));
    }
}
