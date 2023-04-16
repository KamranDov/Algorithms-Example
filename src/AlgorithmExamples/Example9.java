package AlgorithmExamples;

/*verilen tam eded massivini tersine cevir*/
public class Example9 {
    public static void main(String[] args) {
        int[] arrValues = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int reservedValues = 0;
        for (int i = 0; i < arrValues.length; i++) {
            System.out.println("Not reversed value: " + arrValues[i]);
        }
        System.out.println();
        for (int j = arrValues.length - 1; j >= 0; j--) {
            reservedValues = arrValues[j];
            System.out.println("Reserved value: " + reservedValues);
        }

    }

}
