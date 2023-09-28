package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_Loops_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            if (i <=10) {
                int result = i * N;
                System.out.println(N + " x " + i + " = " + result);
            }
        }
        System.out.println();

        bufferedReader.close();
    }

}
