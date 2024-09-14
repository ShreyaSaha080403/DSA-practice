//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
        // code here
        HashMap <Character,Integer> mp =new HashMap<>();
        int l=0,r=0;int maxl=0;
        while(r<S.length()){
            if(mp.containsKey(S.charAt(r))){
                l=Math.max(l,mp.get(S.charAt(r))+1);
            }
            mp.put(S.charAt(r),r);
            maxl=Math.max(maxl,r-l+1);
            r++;
        }
        return maxl;
    }
}