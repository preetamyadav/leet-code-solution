class Solution {
    public void sortColors(int[] nums) {
        int zeroIndex =0;
        int secIndex = nums.length-1;
        int start =0;
        while(start <= secIndex){
            int no = nums[start];
            System.out.println(start +" "+secIndex);
            if(no == 2){
                int temp = nums[secIndex];
                if(nums[secIndex] != no){
                     nums[secIndex] = no;
                    nums[start] = temp;
                 //   start++;
                }
                secIndex--;
            }else if(no == 0){
                int temp = nums[zeroIndex];
                if(temp != no){
                    nums[zeroIndex] = no;
                    nums[start] = temp;
                }
                zeroIndex++;
                start++;
            }else{
                start++;
              //  secIndex --;
            }
            
        }
        
    }
}