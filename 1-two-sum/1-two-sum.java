class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i =0;i<nums.length ;i++){
            int num = target - nums[i];
            if(map.containsKey(num)){
                result[0] = map.get(num);
                result[1] = i;
            }else{
                map.put(nums[i],i);
            }
        }
        return result;
    }
}