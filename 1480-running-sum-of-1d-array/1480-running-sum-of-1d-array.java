class Solution {
    public int[] runningSum(int[] nums) {
        int sum = nums[0];
        for(int index =1; index< nums.length;index++){
            sum = sum + nums[index];
            nums[index] = sum;
        }
        return nums;
    }
}