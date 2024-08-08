class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=m-1;
        int pp=n-1;
        int mer=m+n-1;

        while(pp>=0){
            if(p>=0 && nums1[p]> nums2[pp]){
                nums1[mer]=nums1[p];
                 p--; mer--;
            }
            else{
                nums1[mer]=nums2[pp];
                mer--; pp--;
            }
        }
}
}