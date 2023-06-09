package NumberTasks;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int gcd;

        System.out.println("Enter two numbers");
        number1 = input.nextInt();
        number2 = input.nextInt();


        if(number1 > number2){
            gcd = number2;
        }else{
            gcd = number1;
        }



    }

}
