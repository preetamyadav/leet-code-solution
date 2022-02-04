class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 3){
            return new ArrayList<>();
        }
         List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 3){
            if(nums[0] + nums[1] + nums[2] ==0){
                result.add(Arrays.asList(nums[0],nums[1],nums[2]));
            }
            return result;
        }
      
        for(int p =0; p+2 < nums.length -1;p++){
            
            if(p > 0 && nums[p-1] == nums[p]){
                continue;
            }
            int q = p+1;
            int r = nums.length - 1;
            
            while(q<r){
                int sum = nums[p] + nums[q] + nums[r];
                if(sum == 0){
                    result.add(Arrays.asList(nums[p],nums[q],nums[r]));
                    r--;
                    while(q < r && nums[r] == nums[r+1]) r--;
                }else if(sum <0){
                    q++;
                }else{
                    r--;
                }
            }
        }
        return result;
        
    }
}