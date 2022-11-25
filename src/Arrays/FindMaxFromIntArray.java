package Arrays;

import java.util.Arrays;

public class FindMaxFromIntArray {
    public static void main(String[] args){

        int[] array = {6, 8, 3, 5, 1, 9};
        System.out.println(findLargestArrayNumber(array));
    }

    public static int findLargestArrayNumber (int[] array){
        int max = Arrays.stream(array).max().getAsInt();
        return max;
    }

}


//
//        input: int[] array = {6, 8, 3, 5, 1, 9};
//        output: 9
//        Tip:
//        Arrays are convertible to Stream objects.