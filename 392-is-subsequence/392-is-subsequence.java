class Solution {
    public boolean isSubsequence(String s, String t) {
        int cIndex =0;
        int findCond = s.length();
        if(s.length() < 1){
            return true;
        }
        for(int index =0 ; index < t.length(); index ++){
            if(cIndex > findCond -1){
                return true;
            }
            
            char ch = t.charAt(index);
            if(ch == s.charAt(cIndex)){
                cIndex++;
            }
        }
        
        if(cIndex == findCond){
            return true;
        }
        return false;
        
    }
}