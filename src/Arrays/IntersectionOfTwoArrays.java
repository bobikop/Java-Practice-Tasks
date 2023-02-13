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
        // first create new set since is not supporting duplicates
        Set<Integer> set = new HashSet<>();
        // second sort one of arrays
        Arrays.sort(nums2);

        // third check if any of element from one array is also in another array and if it is add it to the set (use bninary search method)
        for (Integer num : nums1){
            if(binarySearchIterative(nums2, num)){
                set.add(num);
            }
        }

        int i = 0;
        // since we need to return new array with common elements that new array will be set size since all the common elements are added in to the set
        int[] result = new int[set.size()];
        // iterate over set with for loop and add each element to the new result array
        for (Integer num : set){
            result[i++] = num;
        }
        // finally return result array
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