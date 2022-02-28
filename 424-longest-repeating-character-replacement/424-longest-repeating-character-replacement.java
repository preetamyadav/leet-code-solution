class Solution {
    public int characterReplacement(String s, int k) {
        int [] hashSet = new int[26];
        int left = 0;
        int right = 0;
        int max =0;
        int maxFreq =0;
        while(right < s.length()){
            char ch = s.charAt(right++);
            hashSet[ch-'A']++;
            maxFreq = Math.max(maxFreq , hashSet[ch-'A']);
            if(right - left - maxFreq > k){
                char c = s.charAt(left);
                hashSet[c -'A']--;
                left++;
            }
            max = Math.max(max,right-left);
        }
                                                      
        return max;
    }
}