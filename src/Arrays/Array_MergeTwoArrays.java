package InterviewTasks.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_MergeTwoArrays {


         /*
    Write a return method that can concat two arrays
     */


    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        int[] result = new int[array1.length + array2.length];


        int i = 0;

        for (int each1 : array1){
            result [i++]= each1;
        }
        for (int each2 : array2){
            result[i++] = each2;
        }
        System.out.println(Arrays.toString(result));


    }


}
