package Stack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class SunsetViews {
    public static void main(String[] args) {
        int[] buildings = {3,5,4,4,3,1,3,2};
//      sunsetViews(buildings,"EAST").forEach(System.out :: println);
//      sunsetViewsEast(buildings,"EAST").forEach(System.out :: println);
        sunsetViewsWest(buildings,"WEST").forEach(System.out :: println);

    }

    // west and east direction code
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction){

        Stack<Integer> stack = new Stack<>();
        // this part is for the East by default
        int i = 0;
        int step = 1;
        // this part is West
        if (direction.equalsIgnoreCase("west")){
            i = buildings.length-1;
            step = -1;
        }

       while(i>=0 && i < buildings.length){
            while(!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
            i+=step;
        }

       if(direction.equalsIgnoreCase("west")) Collections.reverse(stack);
        return new ArrayList<Integer>(stack);

    }

    // east direction
    public static ArrayList<Integer> sunsetViewsEast(int[] buildings, String direction){

         Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < buildings.length; i++) {
            while(!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
        }
        return new ArrayList<Integer>(stack);

    }

    // west direction

    public static ArrayList<Integer> sunsetViewsWest(int[] buildings, String direction){

        Stack<Integer> stack = new Stack<>();

        for(int i = buildings.length-1; i >= 0 ; i--){
            while(!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
        }

        return new ArrayList<Integer>(stack);

    }

}
/*

    Given an array of buildings and a direction that all of the buildings face, return an array of the indices of the buildings that can
        see the sunset. A building can see the sunset if it's strictly taller than all of the buildings that come after it in the direction
        that it faces. The input array named buildings contains positive, non-zero integers representing the heights of the buildings. A
        building at index i thus has a height denoted by buildings[i] . All of the buildings face the same direction, and this direction is
        either east or west, denoted by the input string named direction , which will always be equal to either "EAST" or "WEST" . In
        relation to the input array, you can interpret these directions as right for east and left for west. Important note: the indices in
        the output array should be sorted in ascending order.
        Sample Input buildings = [3, 5, 4, 4, 3, 1, 3, 2] direction = "EAST"
        Sample Output [1, 3, 6, 7] /

 */
