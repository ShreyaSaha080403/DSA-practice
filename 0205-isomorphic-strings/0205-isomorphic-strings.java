class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> mp=new HashMap<>();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            char c=t.charAt(i);
            if(mp.containsKey(ch)){
                if(mp.get(ch)!=c){
                    return false;
                }
            } else{
                if(mp.containsValue(c)){
                    return false;
                }
                mp.put(ch,c);
            }
            
            i++;
        }
        return true;
    }
}