package NumberTasks;

public class Number_Armstrong {


    /*
    Write a method that can check if a number is Armstrong number
    Armstrong number is an number from which sum of each digits cube value is eaual to number itself
     */

    public static boolean isArmStrongNumber(int num) {
        int a = 0, b = 0, c = num;

        while (num > 0) {
            a = num % 10;
            num = num /10;
            b += (a * a * a);
        }

        return (c == b) ? true : false;

    }




    public static void main(String[] args) {

        System.out.println(isArmStrongNumber(371));
    }
}
