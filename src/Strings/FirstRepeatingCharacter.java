package Strings;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        String str = "Java Developer";

        System.out.println(firstRepeatingCharacter(str));
    }


    public static Character firstRepeatingCharacter(String str){
        //create a hasSet first

        Set<Character> chars = new HashSet<>();

        //iterate over the char array and add chars into hasSet

        for(Character each : str.toCharArray())if (!chars.add(each)) return  each;

        //if add ops is false return that char
        return null;
    }
}
