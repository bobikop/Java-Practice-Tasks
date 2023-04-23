package NumberTasks;

public class ReduceNumberToZero {


    public static void main(String[] args) {
         int num = 8;
        System.out.println(NumberToZero(num));
        System.out.println(NumberToZero1(num));
    }

    //solution 1
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
    //solution 2 (using bitwise operator)

    public static int NumberToZero1(int num){


        int count = 0;
        while(num > 0){
            if((num & 1) == 0){
                num >>= 1;
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
