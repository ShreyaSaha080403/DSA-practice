//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s = in.readLine();

            Solution ob = new Solution();
            out.println(ob.decodeString(s));

            out.println("~");
        }
        out.close();
    }
}
// } Driver Code Ends



class Solution {
    static String decodeString(String s) {
        // code here
        Stack<Integer>count=new Stack<>();
        Stack<String>chars= new Stack<>();
        String curr="";int i=0;
        char[]arr=s.toCharArray();
        while(i<s.length()){
            if(Character.isDigit(arr[i])){
                int num=0;
                while(Character.isDigit(arr[i])){
                    num=num*10+(arr[i]-'0');
                    i++;
                }
                count.push(num);
            }
            
            else if(arr[i]=='['){
                chars.add(curr);
                curr="";
                i++;
            }
            
            else if(arr[i]==']'){
                int n=count.pop();
                StringBuilder ss=new StringBuilder(chars.pop());
                while(n>=1){
                    ss.append(curr);
                    n--;
                }
                curr=ss.toString();
                i++;
            }
            else{
                curr+=arr[i];
                i++;
            }
        }
        return curr;
    }
}