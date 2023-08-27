class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
             if(nums[i]%2==0){
                 ans[s++]=nums[i];
             }
             else{
                 ans[e--]=nums[i];
             }
        }
        return ans;
    }
}