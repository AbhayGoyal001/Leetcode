class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
         int ans = 0;
         int min_diff = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length-2;i++){
            int start = i+1;
            int end = nums.length-1;
  
            while(start<end){
                int sum  = nums[start]+ nums[end] + nums[i];
                 int diff = Math.abs(sum-target);
                if(diff<min_diff){
                    min_diff = diff;
                    ans = sum;
                }
                
                if( sum == target){
                    start++;
                    end--;
                }
                else if(sum<target){
                    start++;
                }
                else if(sum>target){
                    end--;
                }
            }
        }
        return ans;
    }
}