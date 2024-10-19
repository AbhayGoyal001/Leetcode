class Solution {
    public char findKthBit(int n, int k) {

        
        StringBuilder curr = new StringBuilder("0");
        for(int i =1;i<n;i++){
            StringBuilder prev = curr;
            StringBuilder rev = new StringBuilder();
            for(int j = prev.length()-1;j>=0;j--){
                if(prev.charAt(j)=='1'){
                    rev.append('0');
                }
                else{
                    rev.append('1');
                }
            }
            curr = prev.append("1").append(rev);
        }
        // System.out.println(s_current);
        return curr.charAt(k-1);
    }
}