class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans={-1,-1};
        int s= search(nums,target,true);
        int e=search(nums,target,false);
        ans[0]=s;
        ans[1]=e;
        return ans;
    }
    
    int search(int[] nums, int target, boolean isStartIndex){
        int s=0, c=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int m= s+(e-s)/2;
            if(target==nums[m]){
                ans=m;
                if(isStartIndex){
                    e=m-1;
                } else{
                    s=m+1;
                }
            }
            else if(target>nums[m]){
                s=m+1;
            }
            else
                e=m-1;
        }
        return ans;
    }
}