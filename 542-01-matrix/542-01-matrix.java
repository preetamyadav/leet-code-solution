class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rLength = mat.length-1;
        int cLength = mat[0].length-1;
        boolean [][] visited = new boolean[mat.length][mat[0].length];
        for(int i =0;i < visited.length;i++){
            for(int j=0; j< visited[0].length;j++){
                visited[i][j] = false;
            }
        }
        Queue<Tuple> tuples = new LinkedList<>();
        for(int i =0; i< mat.length;i++){
            for(int j =0; j<mat[0].length;j++){
                if(mat[i][j] == 0){
                    visited[i][j] = true;
                    Tuple tuple = new Tuple(i,j,0);
                    tuples.add(tuple);
                }
            }
        }
        
        while(!tuples.isEmpty()){
            Tuple tuple = tuples.poll();
            if(tuple.i -1 >=0 && !visited[tuple.i-1][tuple.j] ){
                mat[tuple.i-1][tuple.j] = tuple.count+1;
                visited[tuple.i-1][tuple.j] = true;
                Tuple t1 = new Tuple(tuple.i-1,tuple.j,tuple.count+1);
                tuples.add(t1);
            }
            if(tuple.j -1 >=0 && !visited[tuple.i][tuple.j-1] ){
                mat[tuple.i][tuple.j-1] = tuple.count+1;
                visited[tuple.i][tuple.j-1] = true;
                Tuple t2 = new Tuple(tuple.i,tuple.j-1,tuple.count+1);
                tuples.add(t2);
            }
            if(tuple.i +1 <=rLength && !visited[tuple.i+1][tuple.j] ){
                mat[tuple.i+1][tuple.j] = tuple.count+1;
                visited[tuple.i+1][tuple.j] = true;
                Tuple t1 = new Tuple(tuple.i+1,tuple.j,tuple.count+1);
                tuples.add(t1);
            }
            if(tuple.j +1 <=cLength && !visited[tuple.i][tuple.j+1] ){
                mat[tuple.i][tuple.j+1] = tuple.count+1;
                visited[tuple.i][tuple.j+1] = true;
                Tuple t1 = new Tuple(tuple.i,tuple.j+1,tuple.count+1);
                tuples.add(t1);
            }
        }
        return mat;
        
    }
}

class Tuple{
    int i;
    int j;
    int count;
    Tuple(int i,int j ,int count){
        this.i= i;
        this.j = j;
        this.count = count;
    }
}