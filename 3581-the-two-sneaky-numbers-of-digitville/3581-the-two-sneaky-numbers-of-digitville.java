class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int [] arr = new int[2];
        Arrays.sort(nums);
        int j =0;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                arr[j]=nums[i];
                j++;
            }
        }
        return arr;
    }
}