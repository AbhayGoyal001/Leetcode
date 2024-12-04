class Solution
{
    public boolean canMakeSubsequence(String s, String t)
    {
        // Step 1: Initialize two pointers, i for s and j for t
        int j = 0; // Pointer for string t
        
        // Step 2: Loop through string s
        for (int i = 0; i < s.length() && j < t.length(); i++)
        {
            // Step 3: Get the current character in s
            char current = s.charAt(i);
            
            // Step 4: Compute the cyclic increment
            char next = current == 'z' ? 'a' : (char)(current + 1);

            // Step 5: Check if current or its cyclic increment matches t[j]
            if (current == t.charAt(j) || next == t.charAt(j))
            {
                j++; // Move to the next character in t
            }
        }
        
        // Step 6: If we have matched all characters of t, return true
        return j == t.length();
    }
}