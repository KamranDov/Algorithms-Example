package AlgorithmExamples;

/*N sayda elementli massiv verirem ve bunlari cap edirem. Amma ki massive verdiyim deyerlerin elementlerini her setirde
 * 3 dene olmaq serti ile cap edirem.*/
public class Example10 {
    public static void main(String[] args) {
        int[] arr = new int[]{33, 61, 71, 23, 67, 11, 99, 83, 35};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }
}
