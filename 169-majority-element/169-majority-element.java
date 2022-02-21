class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int prevNum = nums[0];
        int count =0;
        int requiredLength = nums.length/2;
        for(int index =0; index < nums.length;index++){
            if(nums[index] == prevNum){
                count++;
            }else{
                prevNum = nums[index];
                count =1;
            }
            
            if(requiredLength < count){
                return nums[index];
            }
        }
        return -1;
        
    }
}