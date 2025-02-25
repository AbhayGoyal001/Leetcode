class Solution {
    public int numOfSubarrays(int[] arr) {
         int MOD = 1000000007;
        long odd = 0, even = 1, sum = 0, ans = 0;

        for (int i : arr) {
            sum += i;
            if (sum % 2 == 0) {
                ans = (ans + odd) % MOD;
                even++;
            } else {
                ans = (ans + even) % MOD;
                odd++;
            }
        }
        return (int) ans;
    }
}
