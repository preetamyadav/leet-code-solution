class Solution {
    public int climbStairs(int n) {
        if(n <= 1){
            return 1;
        }
        int prev = 1;
        int newVal = 1;
        
        for(int index=2; index <= n;index++){
            int temp = prev+newVal;
            prev= newVal;
            newVal = temp;
        }
        return newVal;
        
    }
}