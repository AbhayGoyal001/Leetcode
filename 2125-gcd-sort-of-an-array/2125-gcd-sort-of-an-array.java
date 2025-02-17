class Solution {
    public boolean gcdSort(final int[] nums) {
        final var sorted = nums.clone();
        Arrays.sort(sorted);
        final int len = nums.length, max = sorted[len - 1];
        // grouping tree child(index)->parent(value), index==value is root
        final var nodes = new int[max + 1];
        for (int i = 0; i < len; i++) nodes[nums[i]] = -1;
        // value: <=0 not sieved, <0 leaf node, 0 or 1 not in nums, >1 grouped
        for (int p = 2; p <= max / 2; p++) {
            if (nodes[p] > 0) continue; // sieved so not a prime number.
            nodes[p] = p; // p is now a prime number, set self as root.
            for (int group = p, num = p + p; num <= max; num += p) {
                var existing = nodes[num];
                if (existing < 0) nodes[num] = group;  // 1st hit, set group
                else if (existing <= 1) nodes[num] = 1; // value doens't exist in nums
                else if ((existing = root(nodes, existing)) < group) {
                    nodes[group] = existing;
                    group = existing;
                } else nodes[existing] = group;
            }
        }

        for (int i = 0; i < len; i++) {
            if (root(nodes, nums[i]) != root(nodes, (sorted[i]))) return false;
        }
        return true;
    }

    private static int root(final int[] nodes, int num) {
        for (int group; (group = nodes[num]) > 0 && group != num; num = group);
        return num;
    }
}
