// User function Template for Java
class Solution {
    public static void modifyArray(int[] arr) {
        // code
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        for (int i: arr){
            if(i!=-1){
            set.add(i);}
        }
        for(int i=0;i<n;i++){
            if(set.contains(i)){
                arr[i]=i;
            }
            else arr[i]=-1;
        }
    }
}