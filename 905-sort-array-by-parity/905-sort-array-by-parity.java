class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int even =0;
        int odd = nums.length-1;
        
        while(even <= odd){
            if(this.isOdd(nums[even]) && !this.isOdd(nums[odd]) ){
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                odd--;
                even++;
            }else{
                if(!this.isOdd(nums[even])){
                    even++;
                }
                
                if(this.isOdd(nums[odd])){
                    odd--;
                }
            }
            
        }
        return nums;
        
    }
    
    private boolean isOdd(int num){
        if(num % 2 == 0){
            return false;
        }
        return true;
    }
}