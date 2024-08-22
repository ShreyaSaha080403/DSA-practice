//{ Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int ans = ob.DiagonalSum(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends




class Solution
{
    public int DiagonalSum(int[][] matrix)
    {
        // code here
        // int n=matrix.length;
        // int sum=0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[i].length;j++){
        //         if(i==j||j==(n-1-i)){
        //         sum+=matrix[i][j];
        //         }
                
        //     }
        // }
        // if (n % 2 == 1) {
        //     sum -= matrix[n / 2][n / 2];
        // }
        // return sum;
        int n = matrix.length;  // The size of the matrix (number of rows/columns)
        int sum = 0;

        // Sum primary and secondary diagonal elements
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i]; // Primary diagonal
            sum += matrix[i][n - 1 - i]; // Secondary diagonal
        }

        // If the matrix size is odd, subtract the middle element
        //if (n % 2 == 1) {
       //     sum -= matrix[n / 2][n / 2];
        //}
        
        return sum;
    }
}