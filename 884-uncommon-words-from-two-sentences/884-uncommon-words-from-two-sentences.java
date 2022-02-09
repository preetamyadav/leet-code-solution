class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        Map<String,Integer> set = new HashMap<>();
        int count =0;
        for(int i = 0; i < str1.length;i++){
            if(set.containsKey(str1[i])){
                set.put(str1[i],set.get(str1[i])+1);
            }else{
                set.put(str1[i],1);
            }
        }
        
        for(int i = 0; i < str2.length;i++){
            if(set.containsKey(str2[i])){
                set.put(str2[i],set.get(str2[i])+1);
            }else{
                set.put(str2[i],1);
            }
        }
         
        for(Map.Entry<String,Integer> entry: set.entrySet()){
            if(entry.getValue()  == 1){
                System.out.println(entry.getKey());
                count++;
            }
        }
        String[] result = new String[count];
        int index =0;
          for(Map.Entry<String,Integer> entry1: set.entrySet()){
            if(entry1.getValue() == 1){
                System.out.println(entry1.getKey());
                result[index++] = entry1.getKey();
            }
        }

        return result;
    }
}