class Solution {
    public boolean check(int[] nums) {
        if(nums.length == 1) return true;
        int count = 1;
        for(int i =1;i<2*nums.length;i++){
            if(nums[(i-1) % nums.length] <= nums[(i%nums.length)]){
                count++;
            }
            else{
                count = 1;
            }
            if(count == nums.length) return true;
        }
        
   return false;
}
}