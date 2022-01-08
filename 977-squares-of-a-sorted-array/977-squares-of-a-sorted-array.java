class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int i =0;
        int j= nums.length -1;
        int k = nums.length -1;
        while(i<=j){
            int n1 = nums[i] * nums[i];
            int n2 = nums[j] * nums[j];
            if(n1 > n2){
                result[k]= n1;
                i++;
            }else{
                result[k] = n2;
                j--;
            }
            k--;
        }
        return result;
    }
}