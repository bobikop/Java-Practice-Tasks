package PracticeWithFatih.session2.MergeSortedArray;

import java.util.Arrays;

public class MergeSortedArray {


    // nested loop
    public static int[] mergeSortedArrays(int[] nums1, int m, int[] nums2, int n){

        for(int i = m,j = 0; i < m+n; i++,j++){              // 1 2 3 0 0 0             2 5 6
            nums1[i]=nums2[j];
        }
        Arrays.sort(nums1);


        return nums1;

    }


    // two pointers
    public static int[] mergeSortedArrays1(int[] nums1, int m, int[] nums2, int n){

        // 1 2 3 0 0 0             2 5 6

        int a = m-1;
        int b = n-1;
        int i = m+n -1;

        while(b >= 0){
            if(a >= 0 && nums1[a] > nums2[b]){
                nums1[i] = nums1[a];
                i--;
                a--;
            }else{
                nums1[a] = nums2[b]; // since the value is the same we can write any one
                i--;
                b--;
            }

        }

        return nums1;
    }



    public static void main(String[] args) {

        int [] nums1 = {1,2,215,0,0,0};
        int [] nums2 = {2,5,6};

        System.out.println(Arrays.toString(mergeSortedArrays(nums1,3,nums2,3)));
        System.out.println(Arrays.toString(mergeSortedArrays1(nums1,3,nums2,3)));
    }
}
