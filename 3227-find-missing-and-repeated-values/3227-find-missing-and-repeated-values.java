class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int [] arr = new int[2];
        int[] freq = new int[n*n+1];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                freq[grid[i][j]]++;
            }
        }
     
        for(int i =1;i<freq.length;i++){
            if(freq[i]==2) arr[0]=i;
            if(freq[i]==0) arr[1] = i;
            
        }
       
        return arr;
    }
}