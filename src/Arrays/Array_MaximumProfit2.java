package Arrays;

public class Array_MaximumProfit2 {
    public static void main(String[] args) {
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


        int[] arr = {8, 3, 3, 1, 4, 9, 12, 11};

        //first step we say what is our minimum and what maximum profit
        //NOT OPTIMIZED SOLUTION



        int min = arr[0];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int profit = 0;

            if (arr[i] > min){
                profit = arr[i] - min;
                if (profit> max){
                    max = profit;
                }

            }else{
                min = arr[i];
            }
        }

        System.out.println(max);



        //second solution

        int buy =0;
        int sell =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] - arr[i] == max){
                    buy = i+1;
                    sell = j+1;
                }
            }
        }

        System.out.println("Buy on day "+buy+" sell on day "+sell);



    }
}
