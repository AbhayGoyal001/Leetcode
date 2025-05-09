class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    public void reverse(int[]arr, int i , int j){
        while(i<j){
        
            arr[i]= arr[i] ^arr[j];
             arr[j]= arr[i] ^arr[j];
              arr[i]= arr[i] ^arr[j];
              i++;
              j--;
        }
    }
}