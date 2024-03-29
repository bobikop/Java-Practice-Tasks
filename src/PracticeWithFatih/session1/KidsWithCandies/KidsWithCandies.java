package PracticeWithFatih.session1.KidsWithCandies;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0]; // in order to find which kid have a max number of candies will declare kid 1 as a max for coparation in loop
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i]; // find kid with max number of candies
            }
        }
        List<Boolean> list = new ArrayList<>();          // create new list which each emlement represent kid with original number of candies + extra candie
                                                          // if kid original candie number + extra >= from kid with max candy return true,  otherwise false
        for (int j = 0; j < candies.length; j++) {
            if ((candies[j] + extraCandies) >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies,3));
    }

}
