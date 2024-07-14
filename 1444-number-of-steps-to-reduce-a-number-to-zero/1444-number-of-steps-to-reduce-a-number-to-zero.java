class Solution {
    public int numberOfSteps(int num) {
        return helper(num,0);
    }
    public int helper(int n, int c){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return helper(n/2,++c);
        }
        return helper(n-1,++c);
    }
}