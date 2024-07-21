//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }
            Solution obj = new Solution();
            boolean res = obj.isPerfect(nums);
            if (res)
                System.out.println("true");

            else
                System.out.println("false");
        }
    }
}

// } Driver Code Ends



class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        int s=0; int e=arr.length-1;
       while(s<=e){
           if(arr[s]!=arr[e]){
               return false;
           }
           s++;
           e--;
       }
       return true;
    }
}
