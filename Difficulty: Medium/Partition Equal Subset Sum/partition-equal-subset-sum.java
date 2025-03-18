//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution ob = new Solution();

            if (ob.equalPartition(arr))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static boolean equalPartition(int arr[]) {
        // code here
        int n=arr.length,arSum=0;
        for(int i:arr) arSum+=i;
        Boolean dp[][]=new Boolean[n][arSum+1];
        return rec(n-1,arr,arSum,0,dp);
    }
    private static boolean rec(int id,int arr[],int arSum,int sum,Boolean dp[][]){
        if(arSum==sum) return true;
        if(id<0 || sum>arSum) return false;
        if(dp[id][arSum]!=null) return dp[id][arSum];
        boolean p=rec(id-1,arr,arSum-arr[id],sum+arr[id],dp);
        boolean np=rec(id-1,arr,arSum,sum,dp);
        return dp[id][arSum]=p || np;
    }
}