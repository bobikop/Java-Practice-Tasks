package InterviewTasks.arrays;

public class Array_FindMaximum {
    public static void main(String[] args) {
         /*
        Write a function that can find the maximum number from an int Array
     */
        int[] arr = {8, 7, 2, 5, 3, 1};
        System.out.println(maxValue(arr));

    }


        public static int maxValue ( int[] n) {


            int max = Integer.MIN_VALUE;

            for (int each : n) {
                if (each > max) {
                    max = each;
                }
            }

            return max;


        }
}