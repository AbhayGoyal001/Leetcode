class Solution {
    public String getHappyString(int n, int k) {
        List<String> list = new ArrayList<String>();
      
        backtrack(n,"",list);
        return (k>list.size()) ? "" : list.get(k-1);
    }
    public static void backtrack(int n,String ans,List<String> list){
        if(ans.length()==n) {
            list.add(ans);
            return;
        }

        char[] c =  {'a','b','c'};
        for(char ch :c ){
            if(ans.isEmpty()||ans.charAt(ans.length()-1)!=ch){
                backtrack(n,ans+ch,list);
            }
        }

    
    }
}