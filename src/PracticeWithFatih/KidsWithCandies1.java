package PracticeWithFatih;

public class KidsWithCandies1 {
     public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) { //The first for loop is used to find the maximum number of candies among all the kids.
            max = Math.max(candies[i], max);
        }
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {    //The second for loop goes through each kid and checks if the number of candies + extraCandies
                                                      // is greater than or equal to the maximum number of candies. If it is, the result for that kid is set to true.
            if (candies[i] + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
    public static void main(String[] args) {

    }

}
