class Solution {
    public void moveZeroes(int[] nums) {
        int start = -1;
        for(int i =0; i< nums.length;i++){
            if(nums[i] == 0 && start == -1){
                start = i;
            }else if(nums[i] != 0 && start > -1){
                nums[start] = nums[i];
                nums[i]= 0;
                start++;
            }
        }
        
    }
}