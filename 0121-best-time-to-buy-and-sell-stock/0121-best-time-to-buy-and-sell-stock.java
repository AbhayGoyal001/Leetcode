class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int sell =0;
        int profit = 0;
        for(int i =0;i<prices.length;i++){
            buy = Math.min(buy,prices[i]);
            profit = Math.max(profit,prices[i]-buy);
        }
    
        return profit;
    }
}