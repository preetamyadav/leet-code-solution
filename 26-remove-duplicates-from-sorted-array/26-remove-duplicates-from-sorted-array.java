class Solution {
    public int removeDuplicates(int[] nums) {
        int count =1;
        int start =0;
        int end =0;
        while(end < nums.length){
            if(nums[start] != nums[end]){
                nums[++start] = nums[end];  
                count++;
            }
                end++;
        }
        return count;
        
    }
}