class Solution {
    public boolean judgeSquareSum(int c) {
        int start = 0;
        int end = (int)Math.sqrt(c);
        while(start <= end){
            if(Math.pow(start,2) + Math.pow(end,2) == c) return true;
            else if(Math.pow(start,2) + Math.pow(end,2) > c) end--;
            else if(Math.pow(start,2) + Math.pow(end,2) < c) start++;
        }
        return false;
    }
}