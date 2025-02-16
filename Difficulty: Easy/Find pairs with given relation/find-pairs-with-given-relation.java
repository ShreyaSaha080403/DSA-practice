//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
class Solution {
    public static int findPairs(int arr[]) {
        HashMap<Integer, Integer>map = new HashMap<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++ ){
                if(map.containsKey(arr[i]*arr[j]))return 1;
                else{map.put(arr[i]*arr[j], 1);}
            }
        }
        return -1;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            // int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int ans = obj.findPairs(arr);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends