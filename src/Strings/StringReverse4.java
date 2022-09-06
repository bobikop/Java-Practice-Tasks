package Strings;

public class StringReverse4 {
    public static void main(String[] args) {

            String str = "I am good";

            // Finding the index of the whitespaces
            int x = str.indexOf(" ");

            //Base condition
            if(x == -1) {
                System.out.println(str);
            }

            String reverse = str.substring(x+1) +" "+ str.substring(0, x);

            System.out.println("Reversed sentence: " + reverse);
        }



}
