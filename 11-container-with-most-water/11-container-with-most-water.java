class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length -1;
        int max = 0;
        while(start < end){
            int length = end - start ;
            int min = Math.min(height[start] , height[end]);
            int area = length * min;
            if(max < area){
                max = area;
            }
            if(height[start] < height[end]){
                start ++;
            }else{
                end --;
            }
        }
        return max;
    }
}