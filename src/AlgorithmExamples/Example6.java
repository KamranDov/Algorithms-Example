package AlgorithmExamples;
/*sinifte 10 nefer telebe var. bu 10 telebinin qiymetleri 1-100 yuz arasinda verilir. muellim en yaxsi qiymet alan
 telebenin qiymetini (misalcun deyeki ki en yaxsi qiymet alan telebe 85) 100 verib tamamlayir. Sonra en yaxsi qiymet
 alan telebinin qiymeti 100 olsun deye oz qiymetinin ustune nece reqem elave olunubsa, diger telebelerede o qeder
 reqem elave olunsun
 */
public class Example6 {
    public static void main(String[] args) {
        int[] butunTelebeQiymet = {25, 56, 42, 73, 55, 63, 28, 85, 59, 67};
        int enBoyukTelebeQiymet = 0;
        int enBoyukQiymet = 100;
        for (int i = 0; i < butunTelebeQiymet.length; i++) {
            if (enBoyukTelebeQiymet < butunTelebeQiymet[i]) {
                enBoyukTelebeQiymet = butunTelebeQiymet[i];
            }
        }
        System.out.println("En yaxsi qiymet alan telebe: " + enBoyukTelebeQiymet);

        int cixilanReqem = enBoyukQiymet - enBoyukTelebeQiymet;
        while (!(enBoyukTelebeQiymet == enBoyukQiymet)) {
            enBoyukTelebeQiymet++;
        }
        System.out.println("En yaxsi qiymet alan telebenin qiymeti " + enBoyukTelebeQiymet + " oldu\n");
        int digerTelebeElaveQiymet = 0;
        for (int j = 0; j < butunTelebeQiymet.length; j++) {
            digerTelebeElaveQiymet = butunTelebeQiymet[j] += cixilanReqem;
            System.out.println("En yaxsi qiymet alan telebenin qiymetinin 100 olmasi ucun nece reqem elave olunubsa" +
                    " diger teleberede o qeder reqem elave olundu ve qiymetleri: " + digerTelebeElaveQiymet + " oldu.");
        }


    }
}


