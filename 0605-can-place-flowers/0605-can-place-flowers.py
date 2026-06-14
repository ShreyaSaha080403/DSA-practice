class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        count=0
        for i in range(len(flowerbed)):
            l= 0 if i==0 else flowerbed[i-1]
            c= flowerbed[i]
            r= 0 if i==len(flowerbed)-1 else flowerbed[i+1]

            if c==1:
                continue
            else:
                if l!=1 and r!=1:
                    flowerbed[i]=1
                    count+=1
                else:
                    continue    
        return count>=n                


        