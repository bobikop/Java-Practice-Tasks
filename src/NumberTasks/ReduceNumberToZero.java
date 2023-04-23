package NumberTasks;

public class ReduceNumberToZero {


    public static void main(String[] args) {
         int num = 8;
        System.out.println(NumberToZero(num));


    }


    public static int NumberToZero(int num){


        int count = 0;
      while(num > 0){
          if(num % 2 == 0){
              num /= 2;
          }else{
             num -= 1;
          }
          count++;
      }
      return count;
    }
}
// Time Complexity = O(logn)
//Space complexity = O(1)
