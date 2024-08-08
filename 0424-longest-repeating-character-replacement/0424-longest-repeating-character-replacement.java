class Solution {
    public int characterReplacement(String s, int k) {
        int r=0,l=0,maxf=0,maxl=0;
        HashMap<Character,Integer> mp= new HashMap<>();
        while(r<s.length()){
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
            maxf = Math.max(maxf, mp.get(s.charAt(r)));

            if ((r - l + 1) - maxf > k) {
                char leftChar = s.charAt(l);
                mp.put(leftChar, mp.get(leftChar) - 1);
                l++; // Move the left pointer to the right
            }
            maxl = Math.max(maxl, r - l + 1);
            r++; 
        }
        return maxl;
    }
}