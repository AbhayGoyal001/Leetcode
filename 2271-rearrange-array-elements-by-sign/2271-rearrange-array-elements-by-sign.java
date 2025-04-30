class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positive = new int[nums.length/2];
        int [] negative = new int[nums.length/2];
        int pos = 0;
        int neg = 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]>0) {
                    positive[pos++]=nums[i];
                    
            }else{
                negative[neg++]=nums[i];
               
            }
        }
        pos = 0;
        neg = 0;
        int[] ans = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if(i%2==0) {
                ans[i] = positive[pos++];
           
            }
            else {
                ans[i] = negative[neg++];
           
            }
        }
        return ans;
    }
}