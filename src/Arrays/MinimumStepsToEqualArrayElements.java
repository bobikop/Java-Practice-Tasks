package Arrays;

public class MinimumStepsToEqualArrayElements {

//    Given an integer array nums of size n, return the minimum number of
//    moves required to make all array elements equal.
//    In one move, you can increment n - 1 elements of the array by 1.

    public static int minMoves(int[] nums) {

        int sum = 0;
        int steps = 0;
        int min = Integer.MAX_VALUE;
        for (int n : nums) { // n=1,n=2,n=3
            sum += n;//1+2+3 =6
            min = Math.min(n, min); // compare n with min
        }

        return steps = sum - min * nums.length;  // 6 - (1*3) = 6 - 3 = 3
    }

    public static void main(String[] args) {

        int[]  nums = {1, 2, 3};
        int[] nums2 = {1,1,1};
        System.out.println(minMoves(nums));
    }
}
