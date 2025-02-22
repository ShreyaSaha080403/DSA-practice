//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String S = in.readLine();

            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    static int maxLength(String s) {
        // code here
        Stack<Integer> ss = new Stack<>();
        int ans = 0;
        ss.push(-1);
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(c=='('){
                ss.push(i);
            }else{
                ss.pop();
                if(ss.isEmpty()){
                    ss.push(i);
                }else{
                    ans = Math.max(ans,i-ss.peek());
                }
            }
        }
        
        return ans;
    
    }
}