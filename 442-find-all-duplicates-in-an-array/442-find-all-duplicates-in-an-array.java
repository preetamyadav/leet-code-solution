class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        for(int index = 0; index < nums.length ;index++){
            if(set.contains(nums[index])){
                list.add(nums[index]);
            }else{
                set.add(nums[index]);
            }
        }
        return list;
    }
}