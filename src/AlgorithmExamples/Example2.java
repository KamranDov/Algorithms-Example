package AlgorithmExamples;

public class Example2 {
    public static void main(String[] args) {
        /*String tipinde cumle girilir. Verilen cumledeki sozler boyuk kicik herfleri qarisiqdi. Bize verilen tapsiriq
          ondan ibaretdir ki cumledeki her sozun ilk herfleri boyuk qalanlarfi ise kicik herlerle yazlisin.*/

        String str = "sAlAM NeceSeN HaRA GEdiRsEN";
        boolean evvelkiBosluq = true;
        String bosluq = " ";
        for (int i = 0; i < str.length(); i++) {
            String str1 = str.substring(i, i + 1);
            if (evvelkiBosluq) str1 = str1.toUpperCase();
            else str1 = str1.toLowerCase();
            if (str1.equals(" ")) evvelkiBosluq = true;
            else evvelkiBosluq = false;
            bosluq = bosluq + str1;
        }
        System.out.println("Metn ; " + bosluq);


    }
}
