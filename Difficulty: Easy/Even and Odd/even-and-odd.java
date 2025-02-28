//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            ob.reArrange(arr,N);
            
            System.out.println(check(arr,N));
        
System.out.println("~");
}
    }
    static int check(int arr[], int n)
    {
        int flag = 1;
        int c=0, d=0;
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                if(arr[i]%2==1)
                {
                    flag = 0;
                    break;
                }
                else
                    c++;
            }
            else
            {
                if(arr[i]%2==0)
                {
                    flag = 0;
                    break;
                }
                else
                    d++;
            }
        }
        if(c!=d)
            flag = 0;
                
        return flag;
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static void reArrange(int[] arr, int N) {
        // code here
        //Arraylist <Integer> even=new ArrayList<>();
        //         //Arraylist <Integer> odd=new ArrayList<>();
        //         int e=0;int o=1;
        // for(int i=0;i<N;i++){
        //     if(arr[i]%2==0){
        //         //even.add(arr[i]);
        //         if(e<N){
        //         arr[e]=arr[i]; e+=2;}
        //     }
        //     else{
        //         //odd.add(arr[i]);
        //         if(o<N){
        //         arr[o]=arr[i]; o+=2;}
        //     }
        // }        
        int[] result = new int[N];
        int e = 0; // Start index for even
        int o = 1; // Start index for odd

        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                // Place even numbers at even indices
                if (e < N) {
                    result[e] = arr[i];
                    e += 2;
                }
            } else {
                // Place odd numbers at odd indices
                if (o < N) {
                    result[o] = arr[i];
                    o += 2;
                }
            }
        }

        // Copy back the result array to original array
        for (int i = 0; i < N; i++) {
            arr[i] = result[i];
        }

    }
};