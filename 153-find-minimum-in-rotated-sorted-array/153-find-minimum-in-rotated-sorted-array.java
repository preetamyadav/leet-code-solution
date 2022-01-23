class Solution {
    public int findMin(int[] nums) {
        if(nums.length ==1){
            return nums[0];
        }   
        int low=0;
        int high = nums.length -1;
        while(low < high){
            int mid = low + (high - low)/2;
           if(nums[mid] > nums[low]){
                low = mid;
            }else {
                high = mid;
            }
        }
        
        if(nums[low] >= nums[0] && nums[low] <= nums[nums.length -1] ){
            return nums[0];
        }else{
            return nums[low+1];
        }
    }
}