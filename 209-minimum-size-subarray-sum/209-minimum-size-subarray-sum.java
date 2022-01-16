class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int length =Integer.MAX_VALUE;
        int sum =0;
        int start =0;
        for(int i=0; i< nums.length ;i++){
            sum = sum + nums[i];
            
            if(sum >= target){
                 System.out.println(sum);
                int tempLength = i-start+1;
               
                if(tempLength < length){
                    length = tempLength;
                }
                sum = 0;
                i=start;
                start++;
            }
        }
        
        return length == Integer.MAX_VALUE ? 0:length;
        
    }
}