class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> list = new ArrayList<>();
        this.combine(result,list,0,nums);
        return result;
    }
    
    private void combine(List<List<Integer>> result , List<Integer> list, int start, int[] nums){
        if(start > nums.length){
            return;
        }
        result.add(new ArrayList(list));
        for(int index = start; index< nums.length; index++){
            list.add(nums[index]);
            combine(result,list,index+1,nums);
            list.remove(list.size()-1);
        }
    }
}