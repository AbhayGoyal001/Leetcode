class Solution {
    public int[] closestPrimes(int l, int r) {
        
    
   
    //     int size = Math.max(l,r);
    //     int[] primes= new int[size+1];

    //     Arrays.fill(primes, 1);
    //     for(int i =2;i*i<=size;i++){
    //         if(primes[i]==1){
    //             for(int j =i*i;j<=size;j+=i){
    //                 primes[j]=-1;
    //             }
    //         }
    //     }
    //     int [] ans = new int[2];
    // int min = 0;
    // int j =0;
    // List<Integer> list = new ArrayList<Integer>();
    // for(int i=l;i<=r;i++){
    //     if(primes[i]==1) {
    //        list.add(i);
    //     }
        
    // }
    // for(int i =1;i<list.size();i++){
    //     min = Math.min(list.get(i)-list.get(i-1),min);
    //     if(list.get(i)-list.get(i-1)>min){
    //         ans[0]=list.get(i-1);
    //         ans[1] = list.get(i);
    //     }
        
    // }

    // return ans;
    
    
  int size = Math.max(l, r);
        boolean[] primes = new boolean[size + 1];
        Arrays.fill(primes, true);
        
        // Sieve of Eratosthenes
        primes[0] = primes[1] = false; // 0 and 1 are not primes
        for (int i = 2; i * i <= size; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= size; j += i) {
                    primes[j] = false;
                }
            }
        }

        List<Integer> primeList = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (primes[i]) {
                primeList.add(i);
            }
        }

        if (primeList.size() < 2) {
            return new int[]{-1, -1}; // Not enough primes to form a pair
        }

        int minDiff = Integer.MAX_VALUE;
        int[] ans = new int[2];

        for (int i = 1; i < primeList.size(); i++) {
            int diff = primeList.get(i) - primeList.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                ans[0] = primeList.get(i - 1);
                ans[1] = primeList.get(i);
            }
        }

        return ans;
    }
}