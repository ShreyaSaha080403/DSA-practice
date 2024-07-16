class Solution {
    public int longestOnes(int[] nums, int k) {
        int r=0,l=0,z=0,len=0,mlen=0;
        while(r<nums.length){
            if(nums[r]==0){
                z++;
            }
            if(z>k){
                if(nums[l]==0){
                    z--;
                }
                l++;
            }
            if(z<=k){
                len=r-l+1;
                mlen=Math.max(mlen,len);
            }
            r++;
        }
        return mlen;
    }
}