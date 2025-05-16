class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int i =1;i<groups.length;i++){
            if(groups[i-1]!=groups[i]){
                list.add(words[i]);
            }
        }
        return list;

    }
}