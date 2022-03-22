public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        char[] charArray = str.toCharArray();
        int count =0;
        for (int index =0; index<charArray.length;index++ ){
            if(charArray[index] == '1'){
                count++;
            }
        }
        return count;
    }
}