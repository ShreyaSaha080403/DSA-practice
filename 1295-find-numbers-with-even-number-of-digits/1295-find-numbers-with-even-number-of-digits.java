class Solution {
    public int findNumbers(int[] nums) {
        int count=0,ans=0;int n=0;
        for(int i: nums){
            count=0;
            while(i>0){
                
                count++;
                i=i/10;
            }
            if (count%2==0)
                ans++;
            
        }
        return ans;
    }
}