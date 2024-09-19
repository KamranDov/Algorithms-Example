package HackerRank.ProblemSolving;

import java.util.List;

public class CompareTheTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int alice = 0;
        int bob = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alice++;
            } else if (a.get(i) < b.get(i)) {
                bob++;
            }
        }
        return List.of(alice, bob);
    }

    public static void main(String[] args) {

        List<Integer> alice = List.of(5, 66, 7);
        List<Integer> bob = List.of(3, 6, 10);
        System.out.println(compareTriplets(alice, bob));
    }
}