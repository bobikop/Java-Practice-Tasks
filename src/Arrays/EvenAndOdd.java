package Arrays;

import java.util.Arrays;

public class EvenAndOdd {

    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 4, 5};
        int[] nums1 = {17, 19, 21};
        int[] nums2 = {5, 5, 5};

        System.out.println(summary(nums));

    }

    public static  int summary(int [] nums) {


        int sum = 0;
        if (nums == null || nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] %2  !=0){
                if(nums[i] == 5){
                    sum +=5;
                }else{
                    sum +=3;
                }
            }else{
                sum +=1;
            }
        }
    return sum;
        }

}

