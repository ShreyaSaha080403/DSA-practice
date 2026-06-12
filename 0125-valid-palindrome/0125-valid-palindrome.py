class Solution:
    def isPalindrome(self, s: str) -> bool:
        ss = "".join(char.lower() for char in s if char.isalnum())
        s=0
        e=len(ss)-1
        while s<=e:
            if ss[s]!=ss[e]:
                return False
            s+=1
            e-=1    
        return True           

        