// User function Template for Java
class Solution {
    static int distinct(int arr[]) {
        // code here
        HashSet<Integer> set= new HashSet<>();
        for (int i: arr){
            set.add(i);
        }
        return set.size();
    }
}