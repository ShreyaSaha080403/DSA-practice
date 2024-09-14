//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        if (str1.length() != str2.length()) {
        return false;
    }
       if (str1.length() < 2) {
        return str1.equals(str2);
    }

        String s= str1.substring(0,2);
        String s2=str1.substring(2,str1.length());
        
        String ss=s2.concat(s);
        String bb=str1.substring(str1.length()-2,str1.length());
        String aa= str1.substring(0,str1.length()-2);
        String cc= bb.concat(aa);
        //System.out.println(ss);
        return(ss.equals(str2)||cc.equals(str2));
    }
    
}