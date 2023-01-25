package Strings;

import java.util.Arrays;

public class StringReverseChar {

    public static void main(String[] args) {

       char[] s = {'g','d','e','r','h','i','t'};

            int  i = 0;
            int  j = s.length - 1;
            while (i < j) {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;
                j--;
            }

        }
    }

