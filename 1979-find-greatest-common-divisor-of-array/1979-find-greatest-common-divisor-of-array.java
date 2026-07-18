class Solution {
    public int findGCD(int[] nums) {
        int max = 0;
        int min = 1001;
        for(int i : nums){
            max = Math.max(i,max);
            min = Math.min(i,min);
        }
        return gcd(min,max);
    }
    public int gcd(int a , int b){
       return  (b==0)?a:gcd(b,a%b);
    }

}