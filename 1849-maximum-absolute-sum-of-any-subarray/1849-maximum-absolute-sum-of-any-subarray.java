class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = 0;  
        int min = 0; 
          int currMax = 0; 
 int currMin = 0; // I used the hint 

        for (int num : nums) {
            currMax += num;
            currMin += num;

            max = Math.max(max, currMax);
                     min = Math.min(min, currMin);

            if (currMax < 0) currMax = 0;
            if (currMin > 0) currMin = 0;
        }

        return Math.max(max, Math.abs(min));
    }
}
