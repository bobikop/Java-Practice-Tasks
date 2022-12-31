package Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));


    }





    public static int lengthOfLongestSubstring(String s) {

        int length = 0;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String value = s.substring(i, i + 1);
            if (result.contains(value)) {
                int j = result.indexOf(value);
                result = s.substring(i - result.length() + j + 1, i + 1);
            } else {
                result = result.concat(value);
            }
            length = result.length() > length ? result.length() : length;
            length = Math.max(result.length(), length);
        }
        return length;
    }






}

/*

    Longest Substring Without Repeating Characters

        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.
        Example 2:

        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.
        Example 3:

        Input: s = "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
