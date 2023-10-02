package HackerRank.ProblemSolving;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SimpleArraySum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).toList();

        int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static int simpleArraySum(List<Integer> ar) {
        return ar.stream().mapToInt(value -> value).sum();
    }

//    public static int simpleArraySum(List<Integer> ar) {
//        ar = Arrays.asList(1, 2, 3, 4, 10, 11);
//        int sum = 0;
//        for (Integer number : ar) {
//            sum = sum + number;
//        }
//        return sum;
//    }
}
