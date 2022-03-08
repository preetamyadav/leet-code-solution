class Solution {
    public int lengthOfLongestSubstring(String s) {
        int gMax = 0;
        int start =0;
        Set<Character> set = new HashSet<>();
        int index =0;
        for(index =0; index < s.length();index++){
            char ch = s.charAt(index);
            if(set.contains(ch)){
                gMax = Math.max(gMax, index-start);
                while(set.contains(ch)){
                    char rCh = s.charAt(start);
                    set.remove(rCh);
                    start++;
                }
                set.add(ch);
            }else{
                set.add(ch);
            }
        }
        
        return Math.max(gMax , index - start);
        
    }
}