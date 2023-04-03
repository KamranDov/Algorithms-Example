package AlgorithmExamples;

public class Example5 {
    public static void main(String[] args) {
        int[] sagirdlerinQiymetleri = {15, 35, 42, 69, 55, 78, 88, 23, 95, 42};
        int enYaxsiQiymetAlanlar = 0;
        for (int i = 0; i < sagirdlerinQiymetleri.length; i++) {
            if (sagirdlerinQiymetleri[i] > enYaxsiQiymetAlanlar) {
                enYaxsiQiymetAlanlar = sagirdlerinQiymetleri[i];

            }
        }System.out.println(enYaxsiQiymetAlanlar);


    }
}
