package PracticeWithFatih.swapTwoNumbers;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int x,y,z;

        x = 10;
        y = 5;


        System.out.println(x);
        System.out.println(y);

        x = x + y; // 10 = 10 +5 = 15
        y = x - y;  // 5 = 15 -5 -> 10
        x = x-y;   // 10 = 15 - 10 -> 5


        System.out.println(x);
        System.out.println(y);

    }
}
