package AlgorithmExamples;

import java.util.Scanner;

public class InputPassword {

    public static void main(String[] args) {
        String parol = "123456";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Parolu daxil edin: ");
        String yoxlananParol = scanner.nextLine();
        if (parol.equals(yoxlananParol)){
            System.out.println("Giris qebul olundu");
        }else {
            System.err.println("Xetali giris!!!");
        }    }
}
