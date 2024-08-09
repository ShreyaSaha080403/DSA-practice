class Solution {
    public boolean isPalindrome(int x) {
        String n=String.valueOf(x);
        StringBuilder s= new StringBuilder(n);
        String st=s.reverse().toString();
        if(st.equals(n)){
            return true;
        }
        return false;
    }
}