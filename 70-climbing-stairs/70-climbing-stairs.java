class Solution {
    public int climbStairs(int n) {
        int start =0;
        int end = 1;
        for(int i =0; i < n ; i++){
            int temp = end;
             end = start + end ;
            start = temp;
        }
        return end;
        
    }
}