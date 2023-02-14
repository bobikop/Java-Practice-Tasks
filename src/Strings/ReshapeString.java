package Strings;

public class ReshapeString {

    public static void main(String[] args) {

        int n = 3;
        String str = "abc de fghij";

        System.out.println(reshape(n,str));


    }

    static String reshape(int n, String str) {

        StringBuilder sb = new StringBuilder();
        str = str.replace(" ","");
        for (int i = 0; i < str.length(); i++) {
            String add = "";
            if ((i+1)%n == 0) add = "\n";
            sb.append(str.charAt(i)).append(add);
        }
        return sb.toString();
    }

}

