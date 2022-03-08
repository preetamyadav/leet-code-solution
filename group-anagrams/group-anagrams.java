class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> result = new HashMap<>();
        
        for(int index =0; index < strs.length;index++){
            char [] temp = strs[index].toCharArray();
            Arrays.sort(temp);
            String s = new String(temp);
            System.out.println(s);
            if(result.containsKey(s)){
                List<String> list = result.get(s);
                list.add(strs[index]);
            }else{
                List<String> list  = new ArrayList<>();
                list.add(strs[index]);
                result.put(s,list);
            }
        }
       
       List<List<String>> fResult = new ArrayList();
        for(Map.Entry<String,List<String>> list : result.entrySet()){
            fResult.add(list.getValue());
        }
        return fResult;
    }
}