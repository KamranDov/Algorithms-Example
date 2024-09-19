package HackerRank.ProblemSolving;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class AVeryBigSum {


    public static long aVeryBigSum(List<Long> ar) {

        AtomicLong sum = new AtomicLong();

        ar.forEach(sum::addAndGet);
//        ar.forEach(param-> sum.addAndGet(param));

        return sum.get();

//        long sum = 0;
//        for (Long values : ar){
//            sum = sum + values;
//        }
//        return sum;
    }

    public static void main(String[] args) {

        List<Long> ar = List.of(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L);
        System.out.println(aVeryBigSum(ar));

    }
}
