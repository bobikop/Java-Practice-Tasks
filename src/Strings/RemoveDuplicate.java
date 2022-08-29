package InterviewTasks.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {

       // Write a function that can remove the duplicates from an array of integers




    }


    public static int [] removeDuplicates(int[] array){

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array){
            if (!list.contains(each)){
                list.add(each);
            }
        }

        array = new int[list.size()];
        for(int i=0; i< list.size(); i++){
            array[i] = list.get(i);
        }

        return array;
    }

    public static int [] removeDuplicates2(int[] array){
        return Arrays.stream(array).distinct().toArray();
    }


}
