class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501];
        for(int i : arr){
            freq[i]++;
        }
        int largest = 0;
        for(int i = 0 ; i<freq.length;i++){
            if(i == freq[i]){
                largest = Math.max(largest,i);
            }
        }
        return largest==0 ? -1 : largest;
    }
}