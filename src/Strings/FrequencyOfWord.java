package Strings;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "java JAVA jAvA JAva";
        String word = "java";

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();


        int count = 0 ;

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.contains(word)){
                count ++;
                sentence = sentence.replaceFirst(word,""); // to remove first word
            }
        }
        System.out.println(count);
    }
}
