package Arrays;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {
    public static void main(String[] args) {


     /*
    write a program that can move all the zeros to the end of an array
     */

        int[] array = {0, 1, 0, 2, 0, 3, 4};

        int [] result = new int[array.length];


        int i = 0;
        for (int each1 : array){
            if(each1 != 0) {
                result[i++] = each1;
            }
        }

        System.out.println(Arrays.toString(result));


        }

    }


