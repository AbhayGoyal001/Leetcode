class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int i = 0;
        int j = nums.length - 1;
        int idx = nums.length - 1;

        while (i <= j) {
            int num = Math.max(Math.abs(nums[i]), Math.abs(nums[j]));
            ans[idx] = (int) Math.pow(num, 2);

            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                i++;
            } else {
                j--;
            }

            idx--;
        }

        return ans;
    }
}