class Solution {
    public long coloredCells(int n) {
        Long ans = 0L;
        ans =(long) n*n+ (long)(n-1)*(n-1);
        return ans;
    }
}