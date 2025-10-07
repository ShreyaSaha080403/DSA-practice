// User function Template for Java
class Solution {
    public boolean checkValidity(int a, int b, int c) {
        // code here
        if (a + b <= c || a + c <= b || b + c <= a)
            return false;
        else
            return true;
    }
}