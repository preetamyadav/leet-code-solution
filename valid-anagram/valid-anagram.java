class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> set = new HashMap<>();
        boolean notAnagram = true;
        if(s.length() != t.length()){
            return false;
        }
        for(int i =0; i< s.length();i++){
            if(set.containsKey(s.charAt(i))){
                set.put(s.charAt(i),set.get(s.charAt(i))+1);
            }else{
                set.put(s.charAt(i),1);
            }
        }
        
        for(int i =0; i< t.length();i++){
            if(set.containsKey(t.charAt(i))){
                set.put(t.charAt(i),set.get(t.charAt(i))-1);
            }else{
                notAnagram =  false;
                return false;
            }
        }
        if(notAnagram){
               for(Map.Entry<Character,Integer> map: set.entrySet()){
                if(map.getValue() != 0){
                    notAnagram =  false;
                }
            }
            
            return notAnagram;
        }
        return false;
     
       
        
    }
}