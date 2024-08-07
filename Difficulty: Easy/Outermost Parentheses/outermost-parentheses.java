//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.removeOuter(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removeOuter(String s) {
        // code here
        // String str="";
        // int c=0,i=0;
        // while(i<s.length()){
        //     if(s.charAt(i)=='('){
        //         if(c>0){
        //             str=str+s.charAt(i);
        //         }
        //         c++;
        //     }
        //     else{
        //         c--;
        //         if(c>0){
        //             str=str+s.charAt(i);
        //         }
        //     }
        //     i++;
        // }
        // return str;
        
        StringBuilder result = new StringBuilder();
    int count = 0;

    for (char c : s.toCharArray()) {
        if (c == '(') {
            if (count > 0) {
                result.append(c);
            }
            count++;
        } else {
            count--;
            if (count > 0) {
                result.append(c);
            }
        }
    }

    return result.toString();
        
    }
}
