class Solution {
    public int findDuplicate(int[] nums) {
        int start =0;
        while(true){
            int temp = nums[start];
            if(nums[temp] == nums[start]){
                return nums[temp];
            }else{
                nums[start] =  nums[temp];
                nums[temp] = temp;
            }
        }
    }
}