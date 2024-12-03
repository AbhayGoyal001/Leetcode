class Solution {
    public String addSpaces(String s, int[] spaces) {
        int len = s.length() + spaces.length;  // Total length of the result
        StringBuilder res = new StringBuilder(len);  // Pre-allocate result string
        int it = 0;                                 // Pointer for spaces array

        for (int i = 0; i < s.length(); i++) {
            if (it < spaces.length && i == spaces[it]) { // Insert space if index matches
                res.append(' ');
                it++;
            }
            res.append(s.charAt(i));               // Append character to result
        }

        return res.toString();
    }
}