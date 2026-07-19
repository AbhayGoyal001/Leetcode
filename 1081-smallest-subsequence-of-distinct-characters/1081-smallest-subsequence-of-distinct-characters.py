class Solution:
    def smallestSubsequence(self, s: str) -> str:
        stk,seen,lft = [], set(), [0]*128
        for i,c in enumerate(s):  lft[ord(c)] = i
        for i,c in enumerate(s):
            if  c in seen: continue
            while stk and c < stk[-1] and i < lft[ord(stk[-1])]: seen -= {stk.pop()}
            stk.append(c); seen.add(c)
        return  ''.join(stk)
        