package AlgorithmExamples;

import java.util.Scanner;

public class Example3 {
    /*TASK: mellim sinif imtahan qiymetlerini aciqlayir, ama mellim her seyi riyazi fikirlesib sagirdlere
     *deyirki ilk sagirdin qiymetin dedikden sora, sonraki sagirdin qiymeti ozunnen evvelki sagirdin qiymetinden
     *melimin verdiyi qiymete gore ya asagidir yada yuxaridir, ve bundan soraki butun sagirdlerde hemcinin melim
     *veren qiymete gore ilk sagirdin qiymetinden ya cixir yada ustune gelir. Yeni bele hesablanir*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sagirdSayi = 5;
        int ilkSagirdQiymeti = 50;
        int cemi = ilkSagirdQiymeti; 
        for (int i = 1; i < sagirdSayi; i++) {
            System.out.println("Sagirdlerin qiymetlerini daxil edin: ");
            int girilenQiymet = scanner.nextInt();
            girilenQiymet = girilenQiymet + ilkSagirdQiymeti;
            cemi = cemi + girilenQiymet;
            ilkSagirdQiymeti = girilenQiymet;
            System.out.println("netice: "+ girilenQiymet);


        }//sagird qiymet 20, 30, -25, -25
    }
}
