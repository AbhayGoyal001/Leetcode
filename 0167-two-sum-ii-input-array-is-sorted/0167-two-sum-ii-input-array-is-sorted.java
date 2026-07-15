class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while(start<end){
            int diff = numbers[end] + numbers[start];
            if(diff == target){
                return new int[]{start+1,end+1};
            }
            else if (target>diff){
                start++;
            }
            else if(target<diff){
                    end--;
            }
        }
         return new int[]{-1,-1};
    }
}