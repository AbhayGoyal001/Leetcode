class Solution {
    public long maxScore(int[] a, int[] b) {
        int n = b.length;
        long[][] dp = new long[5][n + 1];
        
        
        for (int i = 1; i <= 4; ++i) {
            Arrays.fill(dp[i], Long.MIN_VALUE);
        }
        for (int j = 0; j <= n; ++j) {
            dp[0][j] = 0;
        }

        for (int i = 1; i <= 4; ++i) {
            for (int j = i; j <= n; ++j) {
                dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j - 1] + (long) a[i - 1] * b[j - 1]);
            }
        }

        return dp[4][n];
    }
    }
