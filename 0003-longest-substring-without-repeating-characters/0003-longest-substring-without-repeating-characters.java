class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
        int l=0,r=0,len=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(mp.containsKey(ch)){
                l=Math.max(mp.get(ch)+1,l);
            }
             mp.put(ch,r);
             len=Math.max(len,r-l+1);
             r++;
        }
        return len;
    }
}