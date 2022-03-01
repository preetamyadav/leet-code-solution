class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        
        int carry = 1;
        int end = digits.length-1;
        for(int index =end ; index >= 0; index--){
            int temp = digits[index] + carry;
            int d = temp %10;
            carry = temp/10;
            list.add(d);
        }
        if(carry > 0){
            list.add(carry);
        }
        int[] result = new int[list.size()];
        int k =0;
        for(int j =list.size()-1; j>= 0;j--){
            result[k++] = list.get(j);
        }
        return result;
        
    }
}