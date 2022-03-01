class Solution {
    public int[] countBits(int n) {
        
//         create array of n+1
//         loop from i= 0 to n
//         for each  i find binary and count 1s
//         add `'1s' occurance and save at ith location
//         return result array
        
        int[] result = new int[n+1];
        for(int index =0; index<= n;index++){
            this.findAndCountBits(result,index);
        }
        return result;
        
    }
    
    private void findAndCountBits(int [] result , int index){
        if(index == 0){
            result [index] = 0;
        }else if(index == 1){
            result[index] = 1;
        }else{
            int tempIndex = index;
            int countBits = index % 2;
            index = index / 2;
            countBits = countBits + result[index];
            result[tempIndex] = countBits;
        }
    }
}