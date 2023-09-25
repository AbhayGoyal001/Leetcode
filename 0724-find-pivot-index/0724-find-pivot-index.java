class Solution {
    public int pivotIndex(int[] nums) {
        int total=totalsum(nums);
        int prefixsum=0;
        for(int i=0;i<nums.length;i++){
             int suffixsum=total-prefixsum;
            prefixsum+=nums[i];
           
            if(prefixsum==suffixsum)
            return i;
        }
        return -1;
    }
    static int totalsum(int [] arr){
        int ans =0;
        for(int i:arr){
            ans+=i;
        }
        return ans;
    }
}