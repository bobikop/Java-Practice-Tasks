package D_L_Tasks.missingPozitiveNumber;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
        int[] B = {1,2,3};
        int[] C = {-1, -3};
        System.out.println("solution(A) = " + solution(A));
        System.out.println("solution(B) = " + solution(B));
        System.out.println("solution(C) = " + solution(C));
    }

    public static int solution(int[] A){
        Map<Integer, Boolean> numbers = new HashMap<>();
        for (int num : A) {
            numbers.put(num, true);
        }
        for (int i = 1; i < A.length; i++) {
            if(numbers.get(i) == null) return i;
        }
        return A.length + 1;
    }
}