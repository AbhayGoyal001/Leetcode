class Solution {
public List<List<Integer>> subsets(int[] nums) {
    List<Integer> numsList = new ArrayList<>();
    for (int num : nums) {
        numsList.add(num);
    }

    return subsetsHelper(numsList);
}

public List<List<Integer>> subsetsHelper(List<Integer> nums) {
    List<Integer> subset = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();
    calcSubset(nums, res, subset, 0);
    return res;
}

public void calcSubset(List<Integer> nums,
                        List<List<Integer>> res,
                        List<Integer> subset,
                        int index) {
    res.add(new ArrayList<>(subset)); 

    for (int i = index; i < nums.size(); i++) {
        subset.add(nums.get(i)); 
        calcSubset(nums, res, subset, i + 1); 
        subset.remove(subset.size() - 1); 
    }
}
}