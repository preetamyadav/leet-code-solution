class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2){
            return 0;
        }
        int gMax =0;
        int left=0;
        int right = 1;
        while(right < prices.length){
            if(prices[right] < prices[left]){
                left = right;
                right++;
            }else{
                int count = prices[right] - prices[left];
                if(count > gMax){
                    gMax = count;
                }
                right++;
            }
        }
        return gMax;
    }
}