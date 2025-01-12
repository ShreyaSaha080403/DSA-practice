//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int k = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.searchInsertK(Arr, N, k));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int searchInsertK(int Arr[], int N, int k)
    {
        // code here
        // int flag=-1;
        // for(int i=0;i<N;i++){
        //     if(Arr[i]==k){
        //         flag=i;
        //         break;
        //     }
        // }
        
        // if (flag==-1){
        //     for(int i=0;i<N;i++){
        //         if(k<Arr[i]){
        //             flag=i;
        //             break;
        //         }
        //     }
        // }
        
        // return flag;
        int low=0,high=N-1; int mid=0;
        while(low<=high){
            mid = low + (high - low) / 2;
            if(Arr[mid]==k){
                return mid;
            }
            else if(Arr[mid]<k){
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return low;
    }
}