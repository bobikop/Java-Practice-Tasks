package Strings;

public class FrequencyOfChar2 {
    public static void main(String[] args) {

        String str = "aassffhhh";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count =0;
            char ch =str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
              if (ch == each){
                  count++;
              }
            }
            if (!result.contains(ch+"")){
                result += ch + "" + count;
            }
        }

        System.out.println(result);
    }
}
