class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums.length < 4){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 4){
            if(nums[0]+nums[1]+nums[2]+nums[3] == target){
                result.add(Arrays.asList(nums[0],nums[1],nums[2],nums[3]));
                return result;
            }
        }
        
        for(int a = 0 ; a+3 <= nums.length-1;a++){
            if(a > 0 && nums[a-1] == nums[a]) continue;
            for(int b = a+1;b+2 <= nums.length-1;b++){
                if(b > a+1 && nums[b-1] == nums[b]) continue;
                int c = b+1;
                int d = nums.length -1;
                while(c < d){
                    int sum = nums[a]+ nums[b] + nums[c]+ nums[d];
                    if(sum == target){
                        result.add(Arrays.asList(nums[a],nums[b],nums[c],nums[d]));
                        d--;
                        while(c < d && nums[d] == nums[d+1]) d--;
                    }else if(sum < target){
                        c++;
                    }else{
                        d--;
                    }
                }
            }
        }
        return result;
        
    }
}