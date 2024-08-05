//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
         HashSet <Character>hs=new HashSet<>();
        HashSet <Character>hm=new HashSet<>();
        String uncm="";
        for(int i=0;i<A.length();i++){
            hs.add(A.charAt(i));
        }
        for(int i=0;i<B.length();i++){
            hm.add(B.charAt(i));
        }
        for (Character c : hs) {
            if(hm.contains(c)==false){
                uncm+=Character.toString(c);
            }
        }
        for (Character c : hm) {
            if(hs.contains(c)==false){
                uncm+=Character.toString(c);
            }
        }
        char tempArray[] = uncm.toCharArray();
        Arrays.sort(tempArray);
        String ans=new String(tempArray);
        if(ans.equals("")){
            return "-1";
        }
        return ans;
    }
}