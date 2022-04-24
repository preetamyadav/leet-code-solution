class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int left =0;
        int right = 0;
        int gMax = Integer.MIN_VALUE;
        int sum =0;
        while(right < nums.length){
            sum = sum + nums[right];
            if(sum <0 ){
                 gMax = Math.max(gMax,sum);
                right++;
                left = right;
                sum = 0;
            }else{
                right ++;
                 gMax = Math.max(gMax,sum);
            }
            
             
        }
        return gMax;
        
    }
}