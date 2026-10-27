package array_question.medium_question;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }

    private static int maxProfit(int[] prices) {
        int mini = prices[0], profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int cost = prices[i] - mini;
//            profit = Math.max(profit, cost);
            if (cost > profit) {
                profit = cost;
            }
            if (prices[i]<mini) {
                mini = prices[i];
            }
//            mini = Math.min(mini, prices[i]);
        }
        return profit;
    }
}
