class Solution {
    public int removeElement(int[] nums, int val) {
        int start = -1;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == val){
                start = i;
                break;
            }
        }
        if(start == -1) return nums.length;
        int curr = 0;
        for(int i = start+1;i<nums.length;i++){
            if(nums[i] != val){
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                start++;

            }
        }
        return start;
    }
    
}