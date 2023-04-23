package Arrays;

import java.util.*;

public class LeetCode15_3Sum {

    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        System.out.println(Arrays.asList(nums));

        System.out.println(threeSum(nums));
    }


    public static List<List<Integer>> threeSum(int[] nums){

        Set<List<Integer>> res = new HashSet<>(); // create new set to void duplicates

        if(nums.length == 0)
            return new ArrayList<>(res); // check if given list have any elements, if not return new empty set

        Arrays.sort(nums); // sort given array

        // we can say that we will use 3 pointers. First i second j and third k

        for(int i = 0; i< nums.length - 2; i++){
            int j = i+1;
            int k = nums.length - 1;

            // since our given array is sorted we can use while loop condition to go and sum three pointers
            while(j<k){
                int sum = nums[i]+ nums[j] + nums[k];
                if (sum == 0) // if sum is 0 we will add to set
                    res.add(Arrays.asList(nums[i], nums[j++],  nums[k--]));
                    else if (sum > 0) k--;
                    else if (sum<0) j++;

            }
        }
        return new ArrayList<>(res);
    }
}
