class Solution {
    public int titleToNumber(String columnTitle) {
        int index =0;
        int end = columnTitle.length()-1;
        int count =0;
        while(end >= 0){
            int ch = columnTitle.charAt(end) -'A' +1;
            int pw = (int)Math.pow(26,index);
            count = count + ch * pw;
            end--;
            index++;
        }
        return count;
        
    }
}