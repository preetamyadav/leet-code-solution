class Solution {
    public boolean isPalindrome(String s) {
        String str = this.getAlphaNumeric(s);
        int start = 0;
        int end = str.length() -1;
        System.out.println(str);
        while(start < end){
            if(str.charAt(start++) != str.charAt(end--)){
                return false;
            }
        }
        return true;
        
    }
    
    private String getAlphaNumeric(String s){
        StringBuilder str = new StringBuilder();
        for(int index = 0; index < s.length(); index++){
            int intVal = (int) s.charAt(index);
            System.out.println(intVal);
            
            if((intVal >= 65 && intVal<= 90) || (intVal >= 97 && intVal<=122) || (intVal >=48 && intVal<=57)){
                char ch = s.charAt(index); 
                str.append(Character.toLowerCase(ch));
            }
        }
        return str.toString();
    }
}