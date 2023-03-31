package AlgorithmExamples;
//  verilen massivin elementlerinin toplami ve alinan toplamin bolunerek ortaq mexreci

public class Example1 {
    public static void main(String[] args) {
        int[] values = new int[]{15, 45, 79, 63, 85};//5 elementli massivin deyer verildi.
        int toplam = 0;//massivin elementlerini for dovrune salib sonra toplamaqcun (toplam) adinda deyisen verildi.
        for (int value : values) {//massivin deyerleri for-da dovre salindi ve deyerlerin
            //uzunlugu goturuldu.
            toplam += value;//sora massivin elementleri for dovrune salinib uzunlugu goturulenden sora toplamaqcun
            //toplam deyisenine menimsetildi.
        }//for dongusu bitdi, for dovrunun bloku baglandi.
        System.out.println("toplam = " + toplam);//massivin elementleri sonda toplam deyisenine menimsetildikden sora
        //cap olundu. cemi=287

        double bolme = (double) toplam / values.length;//toplanaraq alinan 287 reqeminin sora bolunerek ortaq
        //mexrecinin tapilmasi ucun double tipinde bolme deyisenine toplam deyiseni casting veya (toplam*1.0)
        //edilerek massivin elementlerinin uzunluguna bolundu.
        System.out.println("bolme = " + bolme);//bolme emelyatida bitdikden sora bolme deyisenide cap olundu.
        //cavab=57.4

    }
}
