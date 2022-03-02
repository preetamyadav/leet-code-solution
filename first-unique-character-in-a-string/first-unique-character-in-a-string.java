class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int index =0; index < s.length(); index ++){
            char ch = s.charAt(index);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int index =0; index < s.length();index++){
            char ch = s.charAt(index);
            if(map.get(ch) == 1){
                return index;
            }
        }
        return -1;
        
    }
}