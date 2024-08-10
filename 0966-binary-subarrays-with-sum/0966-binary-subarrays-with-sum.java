class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int g1 = helper(nums,goal);
        int g2 = helper(nums,goal-1);
        return g1-g2;

    }
    private int helper(int nums[],int goal){
        int n = nums.length;
        int l=0,r=0,s=0,c=0;
        if(goal < 0) return 0;
        while(r<n){
            s += nums[r];
            while(s>goal){
                s -= nums[l];
                l++;
            }
            c += r-l+1;
            r++;
        }
        return c;
    }
}