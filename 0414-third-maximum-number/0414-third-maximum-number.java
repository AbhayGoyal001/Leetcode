class Solution {
    public int thirdMax(int[] nums) {
        // if(arr.length==1){
        //     return arr[0];

        // }
        // if(arr.length==2){
        //     return Math.max(arr[0],arr[1]);
        
        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int num:nums){
            if (num> max){
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (num>secondMax && num<max) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num>thirdMax && num<secondMax) {
                thirdMax = num;
            }
        }
        int result = (thirdMax==Long.MIN_VALUE) ? (int)max : (int)thirdMax;
        return result;
    }
}