// User function Template for Java

class Solution {

    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        LinkedHashSet <Integer> ls= new LinkedHashSet<>();
        for(int i : arr){
            ls.add(i);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.addAll(ls);
        return ans;
    }
}