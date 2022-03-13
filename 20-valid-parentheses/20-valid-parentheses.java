class Solution {
    public boolean isValid(String s) {
    
        if(s.length() < 2){
            return false;
        }
        Stack<Character> stack  = new Stack<>();
        for(int i=0; i< s.length();i++){
            Character c = s.charAt(i);
            if(c.equals('(') || c.equals('{') || c.equals('[')){
                stack.push(c);
            }else {
                if(stack.size() > 0){
                    Character t = stack.pop(); 
                     if(c ==')'){
                        if(t != '('){
                            return false;
                        }
                    }else if(c =='}'){
                        if(t != '{'){
                            return false;
                        }
                    }else{
                        if(t != '['){
                            return false;
                        }
                    }
                }else{
                    return false;    
                }
                

            }
        }
        if(stack.size() <= 0){
            return true;
        }
        return false;
    }
}