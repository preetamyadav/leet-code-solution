class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        this.combine(candidates,target,0,new ArrayList<>(),result,0);
        return result;
        
    }
    
    private void combine(int[] nums,int target ,int start ,List<Integer> list , List<List<Integer>> result , int sum){
        if(sum > target){
            return;
        }
        if(sum == target){
            result.add(new ArrayList(list));
            return;
        }
        for(int index =start; index < nums.length;index++ ){
            sum = sum + nums[index];
            list.add(nums[index]);
            combine(nums,target,index,list,result,sum);
            sum = sum - list.get(list.size()-1);
            list.remove(list.size()-1);
        }
    }
}