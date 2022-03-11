class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        this.getPermutation(nums,new ArrayList<>(),result,nums.length);
        return result;
    }
    
    private void getPermutation(int[] nums,List<Integer> list,List<List<Integer>> result,int k){
        
        if(k == 0){
            result.add(new ArrayList(list));
            return;
        }
        for(int index = 0; index< nums.length;index++){
            if(list.contains(nums[index])) continue;
            list.add(nums[index]);
            this.getPermutation(nums,list,result,k-1);
            list.remove(list.size()-1);
        }
    }
}