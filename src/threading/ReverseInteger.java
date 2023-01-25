package threading;

public class ReverseInteger {

    public static void main(String[] args) {

        int x = 1235;
        int y = 125648595;

        System.out.println(reverse(x));
        System.out.println(reverse(y));

    }


    public static int reverse(int x) {
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) return 0;

        int reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        return reversed;

    }
}
