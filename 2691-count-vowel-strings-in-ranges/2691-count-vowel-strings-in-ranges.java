class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int m=queries.length;
            
        // Set of vowels
        int[] vowel=new int[26];
        Arrays.fill(vowel,0);
        for(char ch:Arrays.asList('a', 'e', 'i', 'o', 'u')){
            vowel[ch-'a']=1;
        }

        // Compute prefix sum array
        int[] sum=new int[n];
        for(int i=0; i<n; i++){
            sum[i]=checkFirstLastVowel(words[i]);
        }        
        for(int i=1; i<n; i++){          
            sum[i]+=sum[i-1];            
        }
    
        // Process queries
        int[] ans=new int[m];
        for(int i=0; i<m; i++){
            ans[i]=sum[queries[i][1]] - ( queries[i][0]-1<0?0:sum[queries[i][0]-1]);
        }

        return ans;
    }


    int checkFirstLastVowel(String word){
        int n=word.length();
        int val= (checkVowel(word.charAt(0)) && checkVowel(word.charAt(n-1)))?1:0;
        return val;
    }

    boolean checkVowel(char chr){
        return (chr=='a' || chr=='e' || chr=='i' || chr=='o' || chr=='u');
    }
}