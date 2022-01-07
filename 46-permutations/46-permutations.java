class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>  result = new ArrayList<>();
        this.getCombinations(result,new ArrayList<>(),nums,nums.length);
        return result;
        
    }
    
    private void getCombinations(List<List<Integer>> result,List<Integer> temp , int[] nums , int k){
        if(k == 0){
            result.add(new ArrayList(temp));
            return ;
        }
        
        for(int start =0 ; start < nums.length;start++){
           if(temp.contains(nums[start])) continue;
            temp.add(nums[start]);
            getCombinations(result, temp, nums , k-1);
            temp.remove(temp.size()-1);
        }
    }
}

// 1 2 3
// 1 1 3
