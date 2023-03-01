package NumberTasks;

public class ArmstrongNumberValidator {

    public static void main(String[] args) {

        System.out.println(isArmstrongNumber(153));

    }

    public static boolean isArmstrongNumber(int N){


        // first will calculate hom manu digits is given number

      String number = String.valueOf(N);
      int len = number.length();
      int sum = 0;
      int copyN = N;

      while(copyN >0){

          int digits = copyN % 10;
          sum += Math.pow(digits,len);
          copyN = copyN /10;

      }
      return sum == N;
    }
}
