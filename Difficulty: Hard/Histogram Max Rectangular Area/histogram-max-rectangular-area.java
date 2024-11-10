//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            String inputLine[] = br.readLine().trim().split(" ");
            long[] arr = new long[(int)n];
            for (int i = 0; i < n; i++) arr[i] = Long.parseLong(inputLine[i]);
            System.out.println(new Solution().getMaxArea(arr));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long histogram[]) {
        // your code here
        long maxi = 0;
        int n = histogram.length;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, histogram[i]);
            int j = i - 1;
            while (j >= 0 && histogram[j] >= histogram[i] ){
                j--;
            }
            j += 1;
            long maxi2 = (i - j + 1) * histogram[i];
            j = i + 1;
            while (j < n && histogram[j] >= histogram[i]) {
                j++;
            }
            j -= 1;
            long maxi3 = (j - i + 1) * histogram[i];
            maxi = Math.max(maxi, (maxi2 + maxi3) - histogram[i]);
        }
        return maxi;
    }
}
