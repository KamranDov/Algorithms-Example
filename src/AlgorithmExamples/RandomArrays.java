package AlgorithmExamples;

public class RandomArrays {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i<arr.length; i++){
//        Random random = new Random(); //Random kodu bele Random classinin obyekti kimide yazila biler.
        int rand = (int) (Math.random()*50);
            System.out.println(rand);
        }
    }
}
