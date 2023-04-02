package AlgorithmExamples;

public class Example4 {
    public static void main(String[] args) {
        int[] heightStudents = {170, 180, 167, 165, 175, 190, 169, 172, 187, 178, 175};
        int tallStudents = 1;
        int heightJack = 177;
        for (int heightStudent : heightStudents) {
            if (heightStudent > heightJack) {
                tallStudents++;
            }
        }
        System.out.println("Jack " + tallStudents + " is in the 5th place");
    }
}
