class Solution {
    public int singleNumber(int[] nums) {
        int item = nums[0];
        for(int i =1; i< nums.length;i++){
            item = item ^ nums[i];
        }
        return item;
    }
}