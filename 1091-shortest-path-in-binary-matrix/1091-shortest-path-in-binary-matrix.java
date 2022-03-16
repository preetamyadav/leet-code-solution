class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int dir[][]={{0,1},{0,-1},{-1,0},{1,0},{-1,-1},{-1,1},{1,-1},{1,1}};
        int cLength = grid[0].length -1;
        int rLength = grid.length -1;
        if(grid[0][0] == 1 || grid[rLength][cLength] ==1){
            return -1;
        }
        Queue<int[]> queue = new LinkedList<>();
        //int [][] initItem = new int[2]
        queue.offer(new int[]{0,0});
        int level =0;
        while(!queue.isEmpty()){
            int size = queue.size();
            level ++;
            for(int index =0; index < size ; index++){
                int[] item = queue.poll();
              //  System.out.println("LOOP ::"+item[0]+" "+item[1]);
                int row = item[0];
                int col = item[1];
                if(grid[row][col] == 0){
                     if(this.isDestination(item,rLength,cLength)){
                        return level; 
                    }
                    grid[row][col] =1 ;
                    for( int i =0; i < dir.length;i++){
                        int newRow = row + dir[i][0];
                        int newCol = col + dir[i][1];
                        if(this.valid(newRow,newCol , rLength,cLength ,grid)){
                            queue.offer(new int[]{newRow,newCol});
                        }
                    }
                } 
            }
        }
        return -1;
        
    }
    
    private boolean valid(int row , int col , int rLength,int cLength, int[][] grid){
       // System.out.println("VALID :: "+row+" "+col);
        if(row < 0 || row > rLength || col < 0 || col > cLength || grid[row][col]  == 1){
            return false;
        }
        return true;
    }
    private boolean isDestination(int []item , int rLength ,int cLength){
        int row = item[0];
        int col = item[1];
        if(row == rLength && col == cLength){
            return true;
        }
        return false;
    }
}