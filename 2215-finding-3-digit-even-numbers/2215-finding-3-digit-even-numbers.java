class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<Integer>();
        int n = digits.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                for( int k = 0; k < n; k++){
                    if(i ==  j || j == k || k == i){
                        continue;
                    }
                    // if( digits[k] == 0){
                    //     continue;
                    // }
                    int ans = digits[i]* 100 + digits[j]*10 + digits[k] * 1;
                    if(ans % 2  == 0 && digits[i]!=0){
                        set.add(ans);
                    }
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>(set);
                Collections.sort(list);
        int [] result = new int[set.size()];
        for(int i =0;i<result.length;i++){
            result[i] = list.get(i);
        }
        return result;
    }
}