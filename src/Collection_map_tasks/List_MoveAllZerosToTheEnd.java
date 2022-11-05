package Collection_map_tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class List_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of the List of integers
     */

    public static List<Integer> moveZerosToTheEnd(List<Integer> list) {
        int originalSize = list.size();
        list.removeAll(Arrays.asList(0));
        int newSize = list.size();
        int totalNumberOfZeros = originalSize - newSize;

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        return list;
    }



    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(5);
        list.add(0);
        list.add(2);
        list.add(0);

        System.out.println(Arrays.asList(list));

        System.out.println(moveZerosToTheEnd(list));
    }


}