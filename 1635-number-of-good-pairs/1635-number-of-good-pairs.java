class Solution {
    public int numIdenticalPairs(int[] nums) {
        int j=1;
        int pairs=0;
        for(int i=0;i<nums.length;i++){
            for(j=i;j<nums.length-1;j++){
                    if(nums[i]==nums[j+1]){
                        pairs++;
                    }
            }
            }
            return pairs;
        }


    }
