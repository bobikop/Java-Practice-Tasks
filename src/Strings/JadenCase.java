package Strings;

public class JadenCase {
    public static void main(String[] args) {

        System.out.println(toJadenCase2("hi my name is ower"));
    }

    public static String toJadenCase2(String givenSentence) {
        if (givenSentence == null || givenSentence.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        String [] words = givenSentence.split(" ");

        for (String str : words){

            result.append((str.charAt(0) + "").toUpperCase())
                  .append(str.substring(1))
                  .append(" ");

        }

        return result.toString().trim();
    }

}