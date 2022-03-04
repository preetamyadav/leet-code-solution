class Solution {
    public List<List<Integer>> generate(int numRows) {
        int [][] v = new int [numRows][numRows];
        v[0][0] = 1;
        
        for(int i = 0; i< v.length -1;i++){
            for(int j =0; j<=i;j++){
                v[i+1][j] += v[i][j];
                v[i+1][j+1] += v[i][j];

            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i< v.length;i++){
            List<Integer> list = new ArrayList<>();
            for(int j =0; j<=i;j++){
                list.add(v[i][j]);
            }
            result.add(list);
        }
        return result;
    }
}