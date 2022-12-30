package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {


        int[] nums1 = {1,2,2,3,6};
        int[] nums2 = {8,5,2,3,8};


        System.out.println(Arrays.toString(intersection(nums1, nums2)));



    }

    public static boolean binarySearchIterative(int[] array, int data){

        int left = 0;
        int right = array.length-1;
        while(left <= right){
            int middle = (left + right) / 2;
            if (array[middle] == data) return true;
            if (array[middle] > data) right = middle - 1;
            else left = middle +1;
        }
        return false;
    }


    public static int[] intersection(int[] nums1, int[] nums2){

        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for(Integer num : nums1){
            if (binarySearchIterative(nums2, num)){
                set.add(num);
            }
        }
        int i = 0;
        int[] result = new int[set.size()];
        for (Integer num : set){
            result[i++] = num;
        }


        return result;
    }



}



//    Given two integer arrays nums1 and nums2, return an array of their intersection.
//        Each element in the result must be unique and you may return the result in any order.
//
//Example 1:
//
//        Input: nums1 = [1,2,2,1], nums2 = [2,2]
//        Output: [2]
//Example 2:
//
//        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//        Output: [9,4]
//        Explanation: [4,9] is also accepted.