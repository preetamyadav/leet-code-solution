class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length < 1){
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        int start =0;
        int left =0;
        int right =1;
        while(right < nums.length){
            int diff = nums[right] - nums[left];
            System.out.println(diff);
            if(Math.abs(diff) > 1){
                StringBuilder s =   new StringBuilder();
                s.append(nums[start]);
                if(nums[start] != nums[left]){
                    s.append("->");
                    s.append(nums[left]);
                }
                result.add(s.toString());
                start = right;
                left = right;
                right++;
            }else{
                right++;
                left++;
            }
        }
        
        StringBuilder sEnd = new StringBuilder();
        sEnd.append(nums[start]);
        if(nums[start] != nums[left]){
            sEnd.append("->");
            sEnd.append(nums[left]);
        }
        result.add(sEnd.toString());
        return result;
        
    }
}