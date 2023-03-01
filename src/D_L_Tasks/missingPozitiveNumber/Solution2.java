package D_L_Tasks.missingPozitiveNumber;

class Solution2 {

    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
//        int[] B = {1,2,3};
//        int[] C = {-1, -3};
        System.out.println("solution(A) = " + solution(A));
//        System.out.println("solution(B) = " + solution(B));
//        System.out.println("solution(C) = " + solution(C));
    }


    public static  int solution(int[] A) {
        int n = A.length;
        boolean[] present = new boolean[n+1]; // create a boolean array to mark presence of integers

        for (int i = 0; i < n; i++) {
            if (A[i] > 0 && A[i] <= n) { // ignore negative integers and integers outside [1, N]
                present[A[i]] = true; // mark presence of positive integer A[i]
            }
        }

        for (int i = 1; i <= n; i++) { // find the smallest missing positive integer
            if (!present[i]) {
                return i;
            }
        }

        return n+1; // return N+1 if all integers from 1 to N are present in A
    }


}