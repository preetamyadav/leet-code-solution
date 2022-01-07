class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        
        this.getCombination(result,s.toCharArray(),0);
        return result;
    }
    
    private void getCombination(List<String> result , char[] chars ,int index){
        if(chars.length == index){
            result.add(new String(chars));
            return;
        }else{
            if(!Character.isDigit(chars[index])){
                chars[index] = Character.toLowerCase(chars[index]);
                getCombination(result,chars,index+1);
                chars[index] = Character.toUpperCase(chars[index]);
            }
            getCombination(result,chars,index+1);
        }
        
    }
}