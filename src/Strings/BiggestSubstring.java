package InterviewTasks.arrays;

public class BiggestSubstring {
    public static void main(String[] args) {
//////////////////////0123456789
        String str = "aaaabbbbccccccccccdddddeeeee";
        String longestSubstring = "";
        String eachCharacter = "";

        for (int i = 0; i < str.length()-1; i++) {
            eachCharacter+=str.charAt(i);

            if (str.charAt(i) == str.charAt(i +1) && i == str.length()-2){
                eachCharacter += str.charAt(i+1);

                if (eachCharacter.length()> longestSubstring.length()){
                    longestSubstring =eachCharacter;
                }
            }
            if(str.charAt(i) != str.charAt(i+1)){
                if (eachCharacter.length()> longestSubstring.length()){
                    longestSubstring = eachCharacter;
                }

                eachCharacter = "";
            }
        }

        System.out.println(longestSubstring);

    }
}
