class Solution(object):
    def getLucky(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: int

        """
    
        def convert(s):
            return ''.join(str(ord(c) - ord('a') + 1) for c in s)
        
        def transform(n):
            return sum(int(d) for d in str(n))
        
        # Convert the string to the integer
        num = convert(s)
        
        # Perform the transform operation k times
        for _ in range(k):
            num = transform(num)
        
        return num
        