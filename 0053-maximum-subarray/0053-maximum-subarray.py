class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr_sum=0
        maxsum=float('-inf')
        for i in range(len(nums)):
            curr_sum+=nums[i]
            
            maxsum=max(maxsum,curr_sum)
            if curr_sum<0:
                curr_sum=0
        return maxsum                 


        