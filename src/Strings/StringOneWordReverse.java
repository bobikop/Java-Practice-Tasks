package Strings;

import java.util.function.Predicate;

public class StringOneWordReverse {

    public static void main(String[] args) {

        String str = "Boban";

        String reverse = "";

        for(int i = str.length() - 1 ; i >= 0; i--){
            reverse += str.charAt(i);
        }

//        System.out.println(reverse.toLowerCase());
        System.out.println(reverse);
    }


//    Predicate<Integer> odd = i -> i%2 != 0;

}

