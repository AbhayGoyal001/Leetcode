class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int count =0;
        int  current = 0;
        int min_val =0;
        int max_val = 0;
        for(int x : differences){
current = current+x;
min_val = Math.min(min_val , current);
max_val = Math.max(max_val , current);

if((upper-max_val)-(lower-min_val)+1 <=0){
    return 0;
    // no possible sequences
}
        }
        return (upper-max_val)-(lower-min_val)+1 ;

        }
        
        
}