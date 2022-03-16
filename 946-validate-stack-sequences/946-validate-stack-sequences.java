class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int index =0;
        int index2 =0;
        
        while(index < pushed.length){
            int item = pushed[index];
            int popedItem = popped[index2];
            if(item == popedItem){
                System.out.println(item +" "+popedItem);
                index++;
                index2++;
                if(!stack.isEmpty()){
                    int item2 = stack.peek();
                    System.out.println("PEEK :: "+item2 +"  "+popped[index2]);
                    while(!stack.isEmpty()){
                        item2 = stack.peek();
                        if(item2 == popped[index2]){
                            index2++;
                            stack.pop();
                        }else{
                            break;
                        }
                    }
                }
            }else{
                System.out.println("PUSED :: "+ pushed[index] +" "+popped[index2]);
                stack.push(pushed[index]);
                index++;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
        
    }
}