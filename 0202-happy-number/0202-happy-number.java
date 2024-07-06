class Solution { //LL is used omg
    public boolean isHappy(int n) {
     int slow = n;
        int fast = n;
        do
        {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));

        }while(fast != slow);

        return fast == 1;
        
    }
 
    int squareSum(int n)
    {
    int ans = 0;
    while(n > 0)
    {
        int rem = n % 10;
        ans+=rem*rem;
        n/=10;
    }
    return ans;
}
}