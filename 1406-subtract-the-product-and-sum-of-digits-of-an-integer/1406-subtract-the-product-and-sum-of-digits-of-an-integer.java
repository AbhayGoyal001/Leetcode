class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        while(n>0)
        {
            int r=n%10;
            prod=prod*r;
            sum=sum+r;
            n=n/10;
        }
        return prod-sum;
    }
}