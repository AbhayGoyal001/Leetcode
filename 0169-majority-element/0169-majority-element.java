class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int target = -1;
        for(int i =0;i<nums.length;i++){
            if(count == 0){
                target = nums[i];
                count=1;
            }
            else if(target==nums[i]) count++;
            else count--;
        }
        return target;
    }
}