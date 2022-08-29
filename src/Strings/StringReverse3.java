package Mani;

public class StringReverse3 {
    public static void main(String[] args) {
        String input = "This is interview question";
        String output = "";
        String[] array = input.split(" ");
        for(int i = array.length-1; i >= 0; i--)
        {
            output += array[i];
            if (i != 0) { output += " ";
            }
        }
        System.out.println(output);
    }
}
