class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int l = 1, r = 0;
        for (int x : nums) r = Math.max(r, x);
        while (l < r) {
            int mid = l + (r - l) / 2;
            int cnt = 0;
            for (int x : nums) cnt += (x - 1) / mid;
            if (cnt > maxOperations) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}