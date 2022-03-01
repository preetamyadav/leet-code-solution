class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int product = 1;
        int noOfZero =0;
        for(int index = 0; index < nums.length;index++){
            if(nums[index] !=0 ){
                product = product* nums[index];
            }else{
                noOfZero++;
            }
        }
        
        for(int index =0; index <nums.length;index++){
            if(noOfZero > 1){
                nums[index] = 0;
            }else if(noOfZero == 1){
                if (nums[index] == 0){
                    nums[index] = product;
                }else{
                    nums[index] =0;
                }
            }else{
                nums[index] = product / nums[index];
            }
        }
        return nums;
        
    }
}