class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minsofar=prices[0]
        maxprofit=0
        for i in prices:
            if i<minsofar:
                minsofar=i
            profit=i-minsofar
            if profit>maxprofit:
                maxprofit=profit    
            
        return maxprofit           

        