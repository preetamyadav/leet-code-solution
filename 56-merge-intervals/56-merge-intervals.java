class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals,(a,b)->a[0]-b[0]);
         List<int[]> list = new ArrayList<>();
        for(int index =0; index <intervals.length;index++){
            if(index == 0){
                int[] arr = new int[2];
                arr[0] = intervals[index][0];
                arr[1] = intervals[index][1];
                list.add(arr);
            }else{
                int[] temp = list.get(list.size()-1);
                if(temp[1] >= intervals[index][0]){
                    temp[1] = Math.max(intervals[index][1], temp[1]);
                    list.set(list.size()-1,temp);
                    //System.out.println(list.size() +" "+temp[0]+" "+temp[1]);
                }else{
                    int[] arr = new int[2];
                    arr[0] = intervals[index][0];
                    arr[1] = intervals[index][1];
                    list.add(arr);
                   // list.add(arr);
                }
            }
        }
       
      //  System.out.println(list.size());
        int[][] fList = new int[list.size()][2];
        for(int i =0; i< list.size();i++){
            int[] arr = new int[2];
            arr[0] = list.get(i)[0];
            arr[1] = list.get(i)[1];
            fList[i] = arr;
        }
        
        return fList;
        
    }
}