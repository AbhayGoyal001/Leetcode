class Solution {
    public int smallestIndex(int[] nums) {
        int res = -1;
        for(int i =0;i<nums.length;i++){
            // if(nums[i] ==0 && i ==0 ) return 0;
            if(i==sum(nums[i])){
                return i;
            } 
        }
        return res;
    }
    public int sum(int n){
        int sum = 0;
        if(n == 0) return 0;
        while(n!=0){
            int rem =  n % 10 ;
            sum = sum  + rem;
            n = n / 10;
        }
        return sum;
    }
}