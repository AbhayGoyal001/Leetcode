class Solution {
    private int count = 0;
    private String result = "";

    public String getHappyString(int n, int k) {
        backtrack(n, "", k);
        return result;
    }

    private void backtrack(int n, String ans, int k) {
        if (ans.length() == n) {
            count++;
            if (count == k) {
                result = ans;
            }
            return;
        }

        char[] chars = {'a', 'b', 'c'};
        for (char ch : chars) {
            if (ans.isEmpty() || ans.charAt(ans.length() - 1) != ch) {
                backtrack(n, ans + ch, k);
                if (!result.isEmpty()) return;  // Stop early if k-th string is found
            }
        }
    }
}