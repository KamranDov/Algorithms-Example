package AlgorithmExamples;
/*sinifdeki sagirdlerin boylari massivin icinde tam eded tipinde sirasiz bir sekilde verilir ve xususi olaraq bu
 * sinifin sagirdi olan Kamil'in boyu secilir. Idman dersinden sagirdler boy sirasiynan duzuldukde Kamil necenci
 * siralarin arasinda dayanib. En uzun sagird 1-ci sirada dayanib. Kamil'in boyu verilen tam eded massivin icinde
 * yer alib. Yeni yazdigin massivin icinde bir elementi Kamili'in boyu kimi nezerde tutmaq olar*/
public class Example7 {
    public static void main(String[] args) {
        int[] boylar = new int[]{182, 176, 193, 184, 175, 171, 190, 168, 170, 166, 188, 173, 169, 166};
        int kamildenUzunlar = 0;
        int kamilBoy = 175;
        int kamilSirasi = 0;
        for (int i = 0; i < boylar.length; i++) {
            if (boylar[i] > kamilBoy) {
                kamildenUzunlar++;
            }
            if (kamilBoy >= boylar[i]) {
                kamilSirasi++;
            }
        }
        System.out.println("Kamil: " + kamilSirasi + " sirada dayanib");
        System.out.println("Sirada Kamil'den uzun: " + kamildenUzunlar + " sagird var");

    }
}
