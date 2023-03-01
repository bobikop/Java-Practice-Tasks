package D_L_Tasks.missingPozitiveNumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DetectCycleSent {

    public static void main(String[] args) {
       int[] num1={1,3,2,4};
      int[] num2={4,1,3,2};
        //int[] num1={1,2,3,4};
       // int[] num2={2,1,4,3};
        System.out.println(detectCycle(num1, num2));

    }
    public static boolean detectCycle(int[] num1, int[] num2){

        List<Edge> edgeList=new ArrayList<>();
        for (int i = 0; i < num1.length; i++) {
            int from=num1[i];
            int to=num2[i];
            edgeList.add(new Edge(from,to));
        }
        HashSet<Integer> visited=new HashSet<>();
        visited.add(edgeList.get(0).from);
        for (Edge edge : edgeList) {
            if(!visited.add(edge.to)) return true;
        }
        return false;
    }

    static class Edge{
        int from;
        int to;

        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }
}