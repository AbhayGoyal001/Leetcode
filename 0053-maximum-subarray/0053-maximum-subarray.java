class Solution {
    public int maxSubArray(int[] nums) {
        long maxSum = Long.MIN_VALUE;
        long arraySum = 0;
        for(int i : nums){
            arraySum += i;
            if(maxSum<arraySum) maxSum = arraySum;
            if(arraySum < 0) arraySum = 0;
        }
        return (int)maxSum;
    }
}