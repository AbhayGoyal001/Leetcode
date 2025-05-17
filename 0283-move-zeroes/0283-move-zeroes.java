class Solution {
    public void moveZeroes(int[] nums) {
        int zero = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){           
               swap(nums,i,zero);
               zero++;
            }
        }
    }
    public void swap(int [] nums ,int i, int zero){
         int temp = nums[i];
                nums[i] = nums[zero];
                nums[zero] = temp;
               
    }
}