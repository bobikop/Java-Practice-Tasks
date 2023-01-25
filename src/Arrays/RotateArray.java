package Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);


    }
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        reverse(nums, 0, len-1); // first reverse entire array
        reverse(nums,0, k-1 );
        reverse(nums, k, len-1);
    }

    private static void reverse(int[]nums, int start, int end){

        while(start < end){

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
