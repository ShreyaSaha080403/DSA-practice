#User function Template for python3


class Solution:
    def missingNumber(self,array,n):
        # code here
        x = 0
        for i in range(n-1):
            x += array[i]
        y = n * (n+1) //2
        c = y - x
        return c


#{ 
 # Driver Code Starts
#Initial Template for Python 3




t=int(input())
for _ in range(0,t):
    n=int(input())
    a=list(map(int,input().split()))
    s=Solution().missingNumber(a,n)
    print(s)
# } Driver Code Ends