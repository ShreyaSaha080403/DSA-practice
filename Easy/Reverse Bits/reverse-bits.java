//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    static Long reversedBits(Long X) {
        // code here
        // String a= Long.toBinaryString(X);
        // a=String.format("%64s",a).replace(' ','0');
        //  StringBuilder rev = new StringBuilder(a).reverse();
        //  Long revDecimal = Long.parseLong(rev.toString(), 2);
        //  return revDecimal; 
          String res = String.format("%32s",Long.toBinaryString(X)).replace(' ','0');
       StringBuilder sb = new StringBuilder(res).reverse();
       
       return Long.parseLong(sb.toString(),2);
    }
}