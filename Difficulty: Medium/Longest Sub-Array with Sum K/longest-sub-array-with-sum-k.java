//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while (testcases-- > 0) {
            String line = br.readLine();
            String[] element = line.trim().split("\\s+");
            int sizeOfArray = Integer.parseInt(element[0]);
            int K = Integer.parseInt(element[1]);

            int arr[] = new int[sizeOfArray];

            line = br.readLine();
            String[] elements = line.trim().split("\\s+");
            for (int i = 0; i < sizeOfArray; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            Solution obj = new Solution();
            int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int A[], int N, int K) {
        // Complete the function
        // int l=0,r=0;int sum=0;int len=0;
        // while(r<A.length){
        //     sum+=A[r];
        //      while (sum > K && l <= r) {
        //     sum -= A[l];
        //     l++;
        // }
        //     if(sum==K){
        //         len=Math.max(len,r-l+1);
        //     }
           
        //     r++;
        // }
        // return len;
        
        HashMap<Integer, Integer> map = new HashMap<>();
    int currentSum = 0;
    int maxLength = 0;

    for (int i = 0; i < N; i++) {
        // Add the current element to the cumulative sum
        currentSum += A[i];

        // Check if the current cumulative sum is equal to K
        if (currentSum == K) {
            maxLength = i + 1; // The subarray starts from index 0
        }

        // Check if there is a prefix subarray we can subtract to get sum K
        if (map.containsKey(currentSum - K)) {
            // Update maxLength if we find a longer subarray
            maxLength = Math.max(maxLength, i - map.get(currentSum - K));
        }

        // Only add the currentSum to the map if it is not already present
        // This ensures we get the longest subarray by keeping the earliest index
        if (!map.containsKey(currentSum)) {
            map.put(currentSum, i);
        }
    }

    return maxLength;
    }
}
