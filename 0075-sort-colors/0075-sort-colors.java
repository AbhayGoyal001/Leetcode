class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int med = 0;
        int high = nums.length-1;
        while(med <=high ){
            if(nums[med] == 0){
                swap(nums,med,low);
                low++;
                med++;
            }
            else if (nums[med] == 1){
                med++;
            }
            else if(nums[med] == 2){
                swap(nums,med,high);
                
                high--;
            }
        }
    }
    public void swap(int [] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}