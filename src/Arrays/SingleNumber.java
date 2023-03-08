package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.sort;

public class SingleNumber {
    public static void main(String[] args) {


        int[] array = {2,2,1};
        int[] array1 = {4,1,2,1,2};
        int[] array2 = {1};

     //   System.out.println(removeDuplicates(array));
        System.out.println(removeDuplicates(array1));

    }


    public static int removeDuplicates(int[] nums){


        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!freq.containsKey(nums[i])){
                freq.put(nums[i],1 );
            }else{
                freq.put(nums[i], nums[i]+1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if (value==1){
                return key;
            }

        }
              return -1;
    }
}


//    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//        You must implement a solution with a linear runtime complexity and use only constant extra space.

