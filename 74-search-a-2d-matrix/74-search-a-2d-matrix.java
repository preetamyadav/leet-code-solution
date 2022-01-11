class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i = 0; i< row;i++){
            if(matrix[i][0] <= target && matrix[i][col-1] >= target){
                return this.matrixBinarySearch(matrix[i],0 , col-1,target);
            }
        }
        return false;
    }
    
    private boolean matrixBinarySearch(int[] nums, int start, int end,int target ){
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return true;
            }else if(target < nums[mid]  ){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
}