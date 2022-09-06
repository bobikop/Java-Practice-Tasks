package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConversion {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"}; //this is an array
        System.out.println(Arrays.toString(arr));// to print array

        System.out.println("--------------------------------------");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

        System.out.println("--------------------------------------");

        char[] ascending = new char[26];
        char[]descending = new char[26];

        for (int i = 0, j = 'A', k='Z'; i < ascending.length; i++, j++,k--) {
            ascending[i] = (char)j;
            descending[i] =(char)k;
        }

        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));
    }

}
