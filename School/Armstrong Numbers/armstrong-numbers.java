//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
         int j=0;
        int b=n;
        int sum=0;
        for(int i=0;i<3;i++)
        {
            j=b%10;
            sum=sum+(j*j*j);
            b=b/10;
        }
        if(sum==n)
        return "Yes";
        else
        return "No";
    }
}