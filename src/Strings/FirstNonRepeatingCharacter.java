package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
//        Map<Integer, String> studentMap = new HashMap<>();
//        studentMap.put(1, "Jack");
//        studentMap.put(2, "Mike");
//        studentMap.put(3,"George");
//        studentMap.put(8, "Ava");


        String str = "Java Developer";

        System.out.println(findFirstNonRepeatingCharacter(str));


    }

    public static Character findFirstNonRepeatingCharacter(String str){

        Map<Character, Integer> map = new HashMap<>();
        int count;
        for (Character each : str.toCharArray()){
            if(map.containsKey(each)){
                count = map.get(each);
                map.put(each, count +1 );

            }
            else map.put(each,1); // if there is no such character in map that's means we put that character first time
        }
        //start from the beginning and check which char have a frequency 1 first

        for ( Character each : str.toCharArray()){
            if (map.get(each) == 1) return each;
        }
        return null;
    }

}
