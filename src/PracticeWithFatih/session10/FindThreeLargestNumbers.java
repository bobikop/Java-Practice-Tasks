package PracticeWithFatih.session10;

import java.util.Arrays;

public class FindThreeLargestNumbers {

    public static void main(String[] args) {
        int[] array={10, 5, 9, 12};
        System.out.println(Arrays.toString(findThreeLargestNumbers(array)));

    }

    public static int[] findThreeLargestNumbers(int[] array) {

        int first;
        int second;
        int third;

        first = second = third = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if(array[i] > third){
               first = second;
               second = third;
               third = array[i];
            }else if (array[i] > second){
                first = second;
                second = array[i];
            } else if (array[i] > first) {
                first = array[i];
            }
        }
        return new int [] {first, second, third};
    }
}
