//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> list = new ArrayList<>();
        recurr(n,1,1l,list);
        return list;
    }
    static void recurr(long n, int i,long curr,ArrayList<Long> res){
        if(curr>n){
            return;
        }
        res.add(curr);
        
         recurr(n, i + 1, curr * (i + 1), res);
    }
}