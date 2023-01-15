package Arrays;

public class Array_MaximumProfit {
      /*
We are given an array of prices for a given stock. ith  element of this array represents the price of the stock on  day i.
We are only permitted to complete only one transaction(buy one or sell one share of the stock) per day.
Write a Java function to find the maximum profit.
    Note that a stock can’t be sold before buying.
    Example:
        Input: [8,3,3,1,4,9,12,11]
        Output: 11
    Explanation: Buy on day 4 (price = 1) and sell on day 7 (price = 12), profit = 12-1 = 11.
    Not 8-1 = 7, as the selling price needs to be larger than buying price.
     */

    public static int maxProfit(int[] prices) {

        int minValue = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++){

            if (prices[i] < minValue){
                minValue = prices[i];
            }
            if (prices[i] - minValue > profit){
                profit = prices[i] - minValue;
            }
        }

        return  profit;

    }


    public static void main(String[] args) {

        int [] nums = {8,3,3,1,4,9,12,11};

        System.out.println(maxProfit(nums));

    }

    }