package InterviewTasks.arrays;

public class Array_FindMinimum {
    public static void main(String[] args) {

        int[] arr = {1,5,9,85,-45,2,5};

        System.out.println(minValue(arr));



    }



    public static  int minValue(int[] m){

        int minimum = Integer.MAX_VALUE;

        for (int each : m) {
            if (each < minimum){
                minimum=each;
            }
        }
        return minimum;
    }


}
