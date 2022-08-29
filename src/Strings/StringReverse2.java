package Mani;

import java.util.Arrays;

public class StringReverse2 {
    public static void main(String[] args){
        String str = "Mani will be great SDET engineer";
        String rev = "";

        //Breaking the sentence into words
        String [] array = str.split(" "); // thi is hos array looks after str is split [Mani, will, be, great, SDET, engineer]
                                                                               //i =     0     1    2     3     4      5

        //Adding the words stored in the array to the last
        for(int i=0; i < array.length; i++){
            rev = array[i] + " " + rev;
        }

        //Printing the reversed sentence
        System.out.println("Reversed sentence: " + rev);


    }
}
