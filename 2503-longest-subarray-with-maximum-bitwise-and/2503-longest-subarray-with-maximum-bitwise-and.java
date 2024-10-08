class Solution {
    public int longestSubarray(int[] nums) {
        int maxBitwiseAnd = Integer.MIN_VALUE;
        
        int maxi = 1;
        int count = 0;
        int i = 0;
        
        for (int num : nums) {
            maxBitwiseAnd = Math.max(maxBitwiseAnd, num);
        }
        
        
        while (i < nums.length) {
            if (nums[i] == maxBitwiseAnd) {
                while (i < nums.length && nums[i++] == maxBitwiseAnd) {
                    count++;
                }
                maxi = Math.max(maxi, count);
                count = 0;
            } else {
                i++;
            }
        }
        
        return maxi;
    }
}