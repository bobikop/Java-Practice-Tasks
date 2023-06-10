package NumberTasks.BinarySearch;

import java.util.Arrays;

public class BinarySearch {

    // find if the element is present in the sorted array

    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7,9,11};

       int result =  binarySearch(ints,9);
        System.out.println(result);
        // :) using Java library we can use
        System.out.println( Arrays.binarySearch(ints, 9));

    }
    private static int binarySearch(int[] numbers, int numberToFind){

        int low = 0;
        int high = numbers.length - 1;

        while (low <= high){
            int middlePosition = (low +high) / 2;
            int middleNumber = numbers[middlePosition];

            if (numberToFind == middleNumber){
                return middlePosition;
            }
            if (numberToFind < middlePosition){
                high = middlePosition -1;
            }else{
                low = middlePosition + 1;
            }
        }
        return -1;
    }

}
