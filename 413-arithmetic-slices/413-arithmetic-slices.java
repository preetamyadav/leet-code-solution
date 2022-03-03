class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        int start =0;
        int end = 2;
        
        int count =0;
        while(end < nums.length){
            if(end- start < 2){
                end++;
                continue;
            }
            if(nums[start+1] - nums[start] == nums[end] - nums[end -1] ){
                count = count + end-start -1;
                end++;
            }else{
                start = end-1;
                end++;
            }
        }
        return count;
    }
}