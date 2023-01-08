package JavaCorePractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalPrograming {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};
        System.out.println(Arrays.toString(new int[]{sumOfOddNumbers1(nums)}));

    }


    public static int sumOfOddNumbers1(int[] numbers) {
        int sum = 0;
        for (int each : numbers) {
            if (each % 2 != 0) {
                sum += each;
            }
        }
        return sum;
    }



}