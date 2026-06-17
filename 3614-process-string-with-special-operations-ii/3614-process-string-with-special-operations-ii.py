class Solution:
    def processStr(self, s: str, k: int) -> str:
        lengths = []
        cur = 0

        
        for ch in s:
            if ch.islower():
                cur += 1
            elif ch == '*':
                if cur > 0:
                    cur -= 1
            elif ch == '#':
                cur *= 2
            elif ch == '%':
                pass  

            lengths.append(cur)

        if k >= cur:
            return '.'

   
        for i in range(len(s) - 1, -1, -1):
            ch = s[i]
            prev = lengths[i - 1] if i > 0 else 0
            curr = lengths[i]

            if ch == '%':
                k = curr - 1 - k

            elif ch == '#':
                half = prev
                k %= half

            elif ch == '*':
                
                pass

            else:  
                if curr == prev + 1:
                    if k == curr - 1:
                        return ch

        return '.'