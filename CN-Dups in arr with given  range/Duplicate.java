

public class Duplicate{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        
       int n = arr.length;
        int xor = 0;

        // Perform XOR on all array elements
        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
        }

        // Perform XOR on numbers from 0 to (n-2)
        for (int i = 0; i <= n - 2; i++) {
            xor ^= i;
        }

        return xor;


    }}

    // public static void main(String[] args)  {
    //     Scanner sc = new Scanner(System.in);
    //     int t = sc.nextInt();
    //     while(t > 0) 
    //     {
    //         int n=sc.nextInt();
    //         int[] arr=new int[n];
    //         for (int i =0 ; i<n;i++)
    //         {
    //             arr[i]=sc.nextInt();
    //         }
    //         System.out.println(Duplicate. duplicateNumber(arr));
           
    //         t -= 1;
    //     }
    // }
    // }
   