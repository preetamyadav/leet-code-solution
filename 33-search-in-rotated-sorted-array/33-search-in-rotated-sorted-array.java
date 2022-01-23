class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1){
            return nums[0] == target ? 0:-1;
        }
        int pivot = this.getPivot(nums);
        System.out.println(pivot);
        int start =0;
        int end =  nums.length -1;
        if(target >= nums[start] && target <= nums[pivot]){
            end = pivot;
        }else{
            start = pivot+1;
        }
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }else if( target < nums[mid]){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return -1;
        
    }
    
    private int getPivot(int[] nums ){
        int low = 0;
        int high = nums.length -1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[low] < nums[mid]){
                low = mid;
            }else{
                high = mid;
            }
        }
        return low;
    }
}