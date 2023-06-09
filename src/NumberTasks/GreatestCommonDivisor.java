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


        // n1 =100, n2 = 75 in this case for example while loop condition will be always false.
        // to have while loop running we need to add not (!) operator t the front of the logic statement inside of while loop

        while(!(number1 % gcd == 0 && number2 % gcd == 0)){
            gcd--;
        }

        System.out.println(gcd);
    }

}


// task is to find greatest common divisor also known In mathematics,
// the Euclidean algorithm, or Euclid's algorithm, is an efficient method for
// computing the greatest common divisor (GCD) of two integers (numbers),
// the largest number that divides them both without a remainder.