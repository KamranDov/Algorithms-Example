package AlgorithmExamples;
/* # simvolu asagdaki kimi setirler ve sutunlarda cap olunsun. Eger bu kodun isleme qaydasi size qarisiq gelerse bu
kodlari debug ederek bir-bir yoxlayin onda rahat bir sekilde basa duseceksiz.
*       #
       ##
      ###
     ####
    #####
   ######
  #######
 ########
*/
public class Example12 {
    public static void main(String[] args) {
        int lines = 8;
        for (int i = 0; i < lines; i++) {
            String s = "";
            for (int j = 0; j < lines - 1 - i; j++) {
                s += " ";
            }
            for (int k = 0; k < i + 1; k++) {
                s += "#";
            }
            System.out.println(s);
        }
    }
}
