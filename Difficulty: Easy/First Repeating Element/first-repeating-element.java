//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (long i : array) arr[idx++] = (int)i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.firstRepeated(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr) {
        // Your code here
         HashMap<Integer, Integer> mp = new HashMap<>();

        // Traverse the array and store the count of each element
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        // Traverse the array again to find the first element with a count greater than 1
        for (int i = 0; i < arr.length; i++) {
            if (mp.get(arr[i]) > 1) {
                return i + 1; // Return the 1-based index
            }
        }

        // If no repeating element is found, return -1
        return -1;
    }
}
