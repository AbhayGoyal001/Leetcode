class Solution {
    public void moveZeroes(int[] nums) {
        int zero = 0; // Position to place the next non-zero element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, i, zero);
                zero++;
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
