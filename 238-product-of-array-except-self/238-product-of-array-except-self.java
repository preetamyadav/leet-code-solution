class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeroCount =0;
        
        for(int index =0;index< nums.length;index++){
            if(nums[index] == 0){
                zeroCount = zeroCount +1;
            }else{
                prod = prod * nums[index];
            }
        }
        
        for(int index =0;index < nums.length;index++){
            if(zeroCount > 1){
                nums[index] = 0;
            }else if(zeroCount == 1 && nums[index] != 0){
                nums[index] =0;
            }else if(zeroCount == 0){
                nums[index] =prod / nums[index];
            }else{
                nums[index] = prod;
            }
        }
        return nums;
        
    }
}