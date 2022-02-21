class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<List<Integer>> result = new ArrayList<>();
        int index = 1;
        int start = intervals[0][0];
        int end = intervals[0][1];
        while(index < intervals.length){
            if(intervals[index][0] <= end){
                end = Math.max(intervals[index][1],end);
            }else{
                List<Integer> list = new ArrayList();
                list.add(start);
                list.add(end);
                result.add(list);
                start = intervals[index][0];
                end = intervals[index][1];
            }
            index++;
        }
         List<Integer> list = new ArrayList();
         list.add(start);
         list.add(end);
         result.add(list);
        
        int [][] fResult = new int[result.size()][2];
        for(int i =0; i < result.size();i++){
            int [] temp = new int[2];
            temp[0] = result.get(i).get(0);
            temp[1] = result.get(i).get(1);
            fResult[i] = temp;
        }
        return fResult;
        
    }
}