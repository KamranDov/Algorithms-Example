package AlgorithmExamples;
/*A ve B sinifi var ve bu iki sinifinde riyaziyyat dersinden aldigi qiymetler ayri ayriliqda sinif icinde toplanilir ve
* sora iki sinifinde qiymetleri muqayise olunur ki hansi sinifin qymetleri daha yuksekdir. */
public class Example13 {
    public static void main(String[] args) {
        int sumA = 0;
        int sumB = 0;
        double averageA;
        double averageB;
        int[] classA = new int[]{15, 45, 78, 11, 5, 33, 68, 41};
        int[] classB = new int[]{70, 20, 93, 62, 79,};

        for (int a : classA) {
            sumA += a;
        }
        for (int b : classB) {
            sumB += b;
        }

        averageA = (double) sumA / classA.length;
        averageB = (double) sumB / classB.length;

        if (sumA == sumB)
            System.out.println("The prices in the two classes are the same");
        else if (averageA > averageB)
            System.out.println("Class A prices are high: " + averageA);
        else
            System.out.println("Class B prices are high: " + averageB);
    }
}
