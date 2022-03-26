class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int left =0;
        int right = 1;
        int count = 1;
        int maxCount =0;
        
        while(right < nums.length){
            if(nums[right - 1] < nums[right]){
                count ++;
                right++;
            }else{
                maxCount = Math.max(count, maxCount);
                count =1;
                right++;
            }
        }
        return Math.max(maxCount,count);
        
    }
}