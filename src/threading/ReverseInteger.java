package threading;

public class ReverseInteger {

    public static void main(String[] args) {

        int x = 1235;
        int y = 1534236469;

        System.out.println(reverse(x));
        System.out.println(reverse(y));

    }


    public static int reverse(int x) {
        int res = 0;
        while(x != 0){
            int newRes = res*10 + x%10;
            if(newRes/10 != res)
                return 0;
            res = newRes;
            x /= 10;
        }
        return res;

    }
}
