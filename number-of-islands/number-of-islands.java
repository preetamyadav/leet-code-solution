class Solution {
    public int numIslands(char[][] grid) {
        
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int count =0;
        for (int i =0 ;i < rowLength ;i++ ){
            for(int j =0; j < colLength;j++){
                if(grid[i][j] == '1'){
                    count++;
                    this.dfs(grid,i,j,rowLength,colLength);
                    
                }
            }
        }
        return count;
    }
    
    private void dfs(char[][] grid , int i ,int j , int rowLength , int colLength){
        if(i < 0 || j < 0 || i >= rowLength || j >= colLength){
            return;
        }
        
        if( grid[i][j]  == '1'){
            grid[i][j] = '2';
            dfs(grid,i,j+1,rowLength,colLength);
            dfs(grid,i,j-1,rowLength,colLength);
            dfs(grid,i+1,j,rowLength,colLength);
            dfs(grid,i-1,j,rowLength,colLength);
        }
    }
}