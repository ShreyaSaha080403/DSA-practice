class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        pre=1
        ans=[1 for i in range(len(nums))]

        for i in range(len(nums)):
            ans[i]=pre
            pre*=nums[i]

        suf=1
        for i in range(len(nums)-1,-1,-1):
            ans[i]*=suf
            suf*=nums[i]

        return ans        
        