package PracticeWithFatih.session8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        ArrayList<String> dic = new ArrayList<>(Arrays.asList(
                "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"
        ));
        String testWord = "ilikesamsungicemango";
        System.out.println(putBreakes(testWord, dic));
    }

    private static boolean putBreakes(String s, List<String> wordDict) {
        Collections.sort(wordDict, (a, b) -> a.length() <= b.length() ? 1 : -1);
        for (String each : wordDict) {
            while (s.contains(each)) {
                s = s.replaceFirst(each, "^".repeat(each.length()));
            }
        }
        return s.replace("^", "").isEmpty();
    }
}