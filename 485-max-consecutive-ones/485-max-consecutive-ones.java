class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int gMax =0;
        int start =0;
        int end =0;
        int count =0;
        while(end < nums.length){
           if( nums[start] == 1 &&  nums[end] == 1 ){
                count++;
                end++;
            }else{
                gMax = Math.max(gMax,count);
                start = ++end;
              
                count =0;
            }
        }
        return Math.max(gMax,count);
    }
}