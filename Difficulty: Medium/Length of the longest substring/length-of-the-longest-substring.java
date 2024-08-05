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
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String S){
        HashMap<Character,Integer> mp= new HashMap<>();
        int r=0;
        int l=0;
        int maxl=0;
        
        while(r<S.length()){
            if(mp.containsKey(S.charAt(r))){
                l=Math.max(mp.get(S.charAt(r))+1,l);
            }
            mp.put(S.charAt(r),r);
            maxl=Math.max(maxl,r-l+1);
            r++;
        }
        return maxl;
    }
}