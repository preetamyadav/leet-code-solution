class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Arrays.sort(nums);
        List<List<Integer>> finalRes = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        this.getSubset2(nums, finalRes, new ArrayList<>(),0,set);
        return finalRes;
    }
    
    private void getSubset2(int[] nums , List<List<Integer>> finalRes , List<Integer> res ,  int start,   Set<List<Integer>> set){
        
        if(nums.length < start){
            return ;
        }
        if(!set.contains(res)){
         finalRes.add(new ArrayList(res));   
         set.add(new ArrayList(res));
        }
        for(int i = start; i< nums.length;i++){             
            res.add(nums[i]); 
            this.getSubset2(nums, finalRes , res , i+1,set);
            res.remove(res.size()-1);
        }
    }
}