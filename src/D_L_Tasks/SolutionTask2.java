package D_L_Tasks;

class SolutionTask2 {
    public static int solution(int[] A) {
         int n = A.length;
    int sum = 0;
//    int min = A[0];
//    int max = A[0];
        for (int i = 0; i < n; i++) {
        sum += A[i];
//        if (A[i] < min) {
//            min = A[i];
//        }
//        if (A[i] > max) {
//            max = A[i];
//        }
    }

        /*
        * find average value of the array, which is the value that we want all the elements
        * to be equal to.
        * by summing up all the elements in the array and dividing
        * by the number of elements.*/
    int target = Math.round((float) sum / n);
    int steps = 0;
        for (int i = 0; i < n; i++) {
        steps += Math.abs(A[i] - target); //to use positive int
    }
        return steps;
    }


    public static void main(String[] args) {
        int [] nums = {3,2,1,1,2,3,1}; //5
        int [] nums1 = {4,1,4,1}; //6
        int [] nums2 = {3,3,3}; //0
        int [] nums3 = {3,2,1}; // 3-2 = 1 + 2-2=0 + 1-2=1 => 1


        System.out.println(solution(nums));
    }
}
