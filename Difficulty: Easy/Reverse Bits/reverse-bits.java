//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static Long reversedBits(Long x) {
        // code here
        String binaryString = Long.toBinaryString(x);
        
        // Pad the binary string to 32 bits
        while (binaryString.length() < 32) {
            binaryString = "0".concat(binaryString);
        }
        
        // Reverse the binary string
        String reversedBinaryString = new StringBuilder(binaryString).reverse().toString();
        
        // Convert the reversed binary string back to a decimal number
        return Long.parseLong(reversedBinaryString, 2);
    }
};