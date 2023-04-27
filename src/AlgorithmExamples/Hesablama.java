package AlgorithmExamples;
import java.lang.String;
import java.util.Scanner;

public class Hesablama {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************");
        System.out.println("HESABLAMA PROSESİNƏ XOŞ GƏLMİSİNİZ");
        System.out.println("****************************************");

        System.out.print("birinci rəqəmi girin: ");
        int a = scanner.nextInt();

        System.out.println();

        System.out.print("ikinci rəqəmi girin: ");
        int b = scanner.nextInt();
        System.out.println("----------------------------------------");

        System.out.print("GÖRƏCƏYİNİZ İŞİ SEÇİN!!!\n");
        System.out.println("""
                1). Toplama +
                2). Çixma   -
                3). Vurma   *
                4). Bölmə   /
                ----------------------------------------""");

        System.out.println("SEÇİMİNİZİ QEYD EDİN!!!");
        int secim = scanner.nextInt();

        if (secim == 1){
            System.out.println("Toplama prosesi= " + (a+b));
        }else if (secim == 2){
            System.out.println("Çıxma prosesi= " + (a-b));
        }else if (secim == 3){
            System.out.println("Vurma prosesi= " + (a*b));
        }else if(secim == 4){
            System.out.println("Bölmə prosesi= " + (float) a/b);
        }else {
            System.out.println("Xətalı giriş etmisiniz. Təkrar yoxlayin.");
        }
    }
}
