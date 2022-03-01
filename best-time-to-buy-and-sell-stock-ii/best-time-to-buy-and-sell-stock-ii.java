class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2){
            return 0;
        }
        int left =0;
        int right =1;
        int max =0;
        
        while(right < prices.length){
            if(prices[right] < prices[left]){
                left = right;
                right++;
            }else{
                int count = prices[right]-prices[left];
                max = max +count;
                left++;
                right++;
            }
        }
        return max;
        
    }
}