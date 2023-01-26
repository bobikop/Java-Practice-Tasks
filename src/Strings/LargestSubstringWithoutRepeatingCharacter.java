package Strings;

import java.util.HashSet;

public class LargestSubstringWithoutRepeatingCharacter {


    //solution 1
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (set.add(c)) {
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                while (s.charAt(left) != c) {
                    set.remove(s.charAt(left));//
                    left++;
                }
                set.remove(c);
                left++;
            }

        }
        return maxLength;
    }



    //solution 2


    // O(n) time | O(n) space
    public int lengthOfLongestSubstring2(String s) {

        // O(n) time | O(n) space
        HashSet<Character> mySet = new HashSet<>();

        int left = 0, right = 0;
        int max = 0;

        while(right < s.length())
        {
            char ch = s.charAt(right);

            if(!mySet.contains(ch))
            {
                mySet.add(ch);
                right++;
                max = Math.max(max, mySet.size());
            }
            else
            {
                mySet.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }



}
