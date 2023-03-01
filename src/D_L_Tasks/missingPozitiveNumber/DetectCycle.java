package D_L_Tasks.missingPozitiveNumber;

import java.util.*;

public class DetectCycle {

    public static void main(String[] args) {
   //int[] A={1,3,2,4};
   //   int[] B={4,1,3,2};
      //int[] A={1,2,1};
      //int[] B={2,3,3};
        int[] A={1,2,3,4};
       int[] B={2,1,4,3};

        System.out.println(detectCycle(A, B));

    }
    public static boolean detectCycle(int[] A, int[] B){
        HashSet<Integer> seen=new HashSet<>();
        HashMap<Integer, Integer> edgeMap=new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (edgeMap.containsKey(A[i])) return false;
            else edgeMap.put(A[i],B[i]);
        }

        int numVisited=0;
        int current=A[0];

        while(numVisited<A.length){
        if(!seen.add(current)) return false;
        current= edgeMap.get(current);
        numVisited++;
        }
        return (numVisited==A.length) && current==A[0];
    }

}