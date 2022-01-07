class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        this.getCombinations(result,new ArrayList<>(),n,k,1);
        return result;
    }
    
    private void getCombinations(  List<List<Integer>> result , List<Integer> temp , int n , int k , int start){
        if(k == 0 ){
            result.add(new ArrayList(temp));
            return;
        }
        
        for(int i = start; i <= n ;i++){
            temp.add(i);
            getCombinations(result,temp,n,k-1,i+1);
            temp.remove(temp.size()-1);
        }
    }
}