class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums){
            set.add(i);
            if(i>9){
               set.add( reversenum(i));
            }
        }
        return set.size();
     
    }
public int reversenum(int n){
        int ans = 0;
        while(n>0){
            ans = ans*10 + n%10;
            n/=10;
        }
        return ans;
    }
}