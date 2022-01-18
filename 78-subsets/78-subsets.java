class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        this.getSubset(nums,finalList , new ArrayList<>(),0);
        return finalList;
    }
    
    private void getSubset(int[] nums  ,List<List<Integer>> finalList, List<Integer> list , int start){
        if(nums.length  < start){
            return;
        }
        finalList.add(new ArrayList(list));
        for(int i= start; i< nums.length;i++){
            list.add(nums[i]);
            getSubset(nums, finalList, list,i+1);
            list.remove(list.size()-1);
        }
    }
}