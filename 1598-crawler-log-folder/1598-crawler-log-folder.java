class Solution {
    public int minOperations(String[] logs) {
        
        Stack<String> stack = new Stack<>();
        
        for(int index =0; index < logs.length; index++){
            String str = logs[index];
            if(str.equals("../")){
                if(stack.size() > 0){
                    stack.pop();
                }
            }else if(!str.equals("./")){
                stack.push(str);
            }
        }
        
        return stack.size();
        
    }
}