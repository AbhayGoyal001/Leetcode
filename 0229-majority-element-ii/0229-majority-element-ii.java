class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i :nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue()>(n/3)) ans.add(entry.getKey());
        }
        return ans;
    }
}