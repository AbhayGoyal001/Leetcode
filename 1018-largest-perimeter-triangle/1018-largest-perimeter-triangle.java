class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int ans = 0;
        for(int i = nums.length-1;i>=2;i--){

                if(nums[i]<nums[i-1] + nums[i-2]){
                    max = 0;
                    max=nums[i] + nums[i-1] + nums[i-2];
                    ans = Math.max(ans,max);
                }
                
        }
        return ans;
    }
}