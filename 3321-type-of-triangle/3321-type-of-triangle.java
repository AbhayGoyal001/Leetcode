

class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        // Check for triangle validity first
        if (a + b <= c) {
            return "none";
        }

        // Now check for triangle types
        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
