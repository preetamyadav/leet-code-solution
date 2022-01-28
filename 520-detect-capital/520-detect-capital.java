class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() >= 2){
            boolean isFirstLetterIsCapital = false;
            boolean isSecondLetterIsCapital = false;
            
            if(word.charAt(0) >= 'A' && word.charAt(0)  <= 'Z'){
                isFirstLetterIsCapital = true;
            }
            if(word.charAt(1) >= 'A' && word.charAt(1)  <= 'Z'){
                isSecondLetterIsCapital = true;
            }
           // if(word.length() == 2){
                if(!isFirstLetterIsCapital && isSecondLetterIsCapital){
                       return false;
                }
             //   return true;
            //}
            
            for(int index =2 ;index < word.length();index++){
                if(isFirstLetterIsCapital && isSecondLetterIsCapital){
                    char ch = word.charAt(index);
                    if(!(ch >= 'A' && ch <= 'Z')){
                            return false;
                    }
                }else{
                    char ch = word.charAt(index);
                    if(!(ch >= 'a' && ch <= 'z')){
                        return false;
                    }
                }
            }
            
            
        }
        return true;
    }
}