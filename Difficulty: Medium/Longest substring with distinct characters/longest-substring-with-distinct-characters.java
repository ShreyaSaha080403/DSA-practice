//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashMap <Character,Integer> mp=new HashMap<>();
        int len=0,r=0,l=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(mp.containsKey(ch)) l= Math.max(l, mp.get(ch)+1);
            mp.put(ch,r);
            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
    }
}