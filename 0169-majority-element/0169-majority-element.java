class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int target = -1;
        for(int i =0;i<nums.length;i++){
            if(count == 0){// If majority element exist then it is in starting of the array of starting element is the target we have to check and starting elements  is wrong target  then automatically count will be zero there is a decrement in below
                target = nums[i]; //Initialize the value and found the target
                count=1; // Increment Occurence 
            }
            else if(target==nums[i]) count++; // If present then increase the counter
            else count--;// Either decrease the counter 
        }
        return target;
    }
}