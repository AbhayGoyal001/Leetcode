class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxVal = 0; // To store the maximum triplet value

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    long currentVal = (long) (nums[i] - nums[j]) * nums[k];
                    maxVal = Math.max(maxVal, currentVal);
                }
            }
        }
        return maxVal;
    }
}
