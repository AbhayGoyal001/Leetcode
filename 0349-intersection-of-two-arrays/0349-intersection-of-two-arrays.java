class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        int i =0;
        int j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int prev = -1;
        while(i<nums1.length && j<nums2.length){
            
            if(nums1[i]==nums2[j]){
            
                if(nums1[i]!=prev)ans.add(nums1[i]);
                 prev = nums1[i];
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        // System.out.println(ans);
        int[] primitiveArray = ans.stream().mapToInt(Integer::intValue).toArray();
        return primitiveArray;
    }
}