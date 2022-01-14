class Solution {
    public boolean backspaceCompare(String s, String t) {
        if(s.equals(t)){
            return true;
        }
        Stack<Character> str1 = new Stack<>();
        for(int i =0; i< s.length();i++){
            if(s.charAt(i) == '#'){
                if(!str1.isEmpty()){
                    str1.pop();    
                }
            }else{
                str1.push(s.charAt(i));
            }
        }
        
        Stack<Character> str2 = new Stack<>();
        for(int j =0; j< t.length();j++){
            if(t.charAt(j) == '#'){
                if(!str2.isEmpty()){
                    str2.pop();    
                }
            }else{
                str2.push(t.charAt(j));
            }
        }
        
        while(!str1.isEmpty() && !str2.isEmpty()){
            Character c1 =  str1.pop();
            Character c2 =  str2.pop();
            if(c1 != c2){
                return false;
            }
        }
        if(str1.isEmpty() && str2.isEmpty()){
            return true;
        }
        return false;
    }
}