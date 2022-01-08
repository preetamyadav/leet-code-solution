class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        int[] result = new int[2];
        result[0] = -1;
        result [1] = -1;
    
        if(nums.length == 0){
            return result;
        }
        int index = -1;
        while(start <= end ){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                index = mid;
                break;
            }else if(target < nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        
        if(index > -1){
            int i = index;
            int j = index;
            while(i >= 0){
                if(nums[i] != target){
                    break;
                }
                i--;
            }
            while(j <= nums.length -1){
                if(nums[j] != target){
                   break; 
                }
                j++;
            }
            result[0] = i+1;
            result [1] = j-1;
        }
        return result;
        
    }
}