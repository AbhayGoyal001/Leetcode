class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        int[][] dp = new int[n][n];
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            indexMap.put(arr[i], i);
        }
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                int prev = arr[k] - arr[j]; 
                if (prev < arr[j] && indexMap.containsKey(prev)) { 
                    int i = indexMap.get(prev);
                    dp[j][k] = dp[i][j] + 1; 
                    maxLen = Math.max(maxLen, dp[j][k] + 2); 
                } else {
                    dp[j][k] = 0; 
                }
            }
        }

        return maxLen >= 3 ? maxLen : 0;
    }
}