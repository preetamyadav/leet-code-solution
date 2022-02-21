class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0] == b[0] ? b[1] - a[1] : a[0]-b[0]);
        int index =0;
        int current =0;
        int count =0;
        while(index < intervals.length){
            System.out.println(intervals[index][0] +" "+intervals[index][1]);
            if(current < intervals[index][1]){
                current = intervals[index][1];
                count++;
                
            }
            index++;
        }
        return count;
            
        
    }
}