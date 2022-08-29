package Self_PracticingReplitTasks.replit1;

public class MiddleCharacter {
    public static void main(String[] args) {

        String word = "boaban";


        int length = word.length();
        if(length % 2 != 0) {
          char mid = word.charAt(length / 2);
            System.out.println(mid);
        } else{
        char mid1 = word.charAt((length / 2) - 1);
        char mid2 = word.charAt((length / 2) );
            System.out.println(mid1 +""+ mid2);
        }


    }

}
