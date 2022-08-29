package InterviewTasks.arrays;

public class MyFrequencyOfChar {
    public static void main(String[] args) {
        
        String name = "manuela";

        String result = "";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            int count = 0;

            for (int j = 0; j < name.length(); j++) {
                char ch2 = name.charAt(j);

                if (ch == ch2){
                    count++;
                }



            }


            if (result.contains(""+ch)){
                continue;
            }

            result+=ch;
            result+=count;
        }

        System.out.println(result);
    }
}
