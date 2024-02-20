//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();

            Solution ob = new Solution();
            ob.printDiamond(n);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    void printDiamond(int n) {
        // Your code here
        // int x=n-1;
        
           int p=0,q=n-1;
           
         for(int i=0;i<2*n;i++){
            for(int j=0;j<q;j++){
                System.out.print(" ");
            }
            if(i==n-1){
                q=0;
            }
            else if(i>n-1){
                    q++;
                }
                else{
                    q--; 
                }
            
            for(int j=0;j<=p;j++){
                System.out.print("* ");
              
            }
             if(i>n-1){
                    p--;
                }
                 else if(i==n-1){
                p=n-1;
            }
                else{
                    p++; 
                }
            System.out.println();}
       
}
}
/* 
for(s=1;s<=)
*/
