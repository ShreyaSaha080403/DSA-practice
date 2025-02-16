//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    int countTriplet(int arr[]) {
        // code here
        
        //TLE
        // List <Integer> list=new ArrayList<>();
        // for(int i:arr){
        //     list.add(i);
        // }
        // int count=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         int sum=arr[i]+arr[j];
        //         if(list.contains(sum)){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        
        //OPTIMAL
        int count=0;
        Arrays.sort(arr);
        for(int k=arr.length-1;k>=2;k--){
            int i=0, j=k-1;
            while(i<j){
                int sum=arr[i]+arr[j];
                if(sum==arr[k]){
                    count++;
                    i++;
                    j--;
                }
                else if(sum<arr[k]){
                    i++;
                }
                else
                j--;
            }
        }
        return count;
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
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
            int res = obj.countTriplet(arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends