package AlgorithmExamples;
 /*String tipinde deyerler teyin edirik ve baxiriq ki bu deyerlerin icinde eger saitler varsa o saitler sil sonra yeniden
 * String tipindeki deyerleri cap et.*/
public class Example11 {
    public static void main(String[] args) {
        String changedVaule = "Java Proqramlaşdırma Dilinə Xoş Gəlmisiniz!";
        char[] saitlerAZ = {'a', 'ı', 'o', 'u', 'e', 'ə', 'i', 'ö', 'ü'};
        String nullValues = "";
        String assignedCharValues = String.valueOf(saitlerAZ);
        for (int i = 0; i < changedVaule.length(); i++) {
            String checkedSubstring = changedVaule.substring(i, i + 1);
            for (int j = 0; j < assignedCharValues.length(); j++) {
                if (checkedSubstring.equalsIgnoreCase(assignedCharValues.substring(j, j + 1))) {
                    checkedSubstring = "";
                    break;
                }
            }
            nullValues += checkedSubstring;
        }
        System.out.println(nullValues);
    }
}
