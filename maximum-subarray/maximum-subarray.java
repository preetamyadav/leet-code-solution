class Solution {
    public int maxSubArray(int[] nums) {
        int max =Integer.MIN_VALUE;
        int count =0;
        for(int index =0; index < nums.length;index++){
            count = count + nums[index];
            if(count < 0){
                 max = Math.max(count,max);
                count =0;
            }else{
                max = Math.max(count,max);
            }
        }
        
        return max == Integer.MIN_VALUE ? -1: max;
        
    }
}