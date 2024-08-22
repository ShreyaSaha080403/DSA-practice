//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            int M[][] = new int[N][N];
            String arr[] = in.readLine().trim().split("\\s+");
            for(int i = 0;i < N*N; i++)
                M[i/N][i%N] = Integer.parseInt(arr[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.distinct(M, N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int distinct(int M[][], int N)
    {
        // code here
        HashMap<Integer,Integer> mp=new HashMap<>();
        int c=0;
        for(int i=0;i<M.length;i++){
            mp.put(M[0][i],1);
        }
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
               if(mp.containsKey(M[i][j]) && mp.get(M[i][j])==i){
                   mp.put(M[i][j],i+1);
               }
            }
        }
        
        for(int k: mp.values()){
            if(k==N)
            c++;
        }
        
        return c;
    }
}