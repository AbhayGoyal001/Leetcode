class Solution {
     public long countFairPairs(int[] nums, int lower, int upper) {
	Arrays.sort(nums);
	long res = 0, last = 0;

	for(int i=1; i<nums.length; i++) {
		if(nums[i] == nums[i-1]) {
			if(lower <= nums[i]*2 && nums[i]*2 <= upper) last++;
		} else {
			int lidx = -1, ridx = -1;
			int l=0, r=i-1;
			while(l <= r) {
				int mid = l + (r-l)/2;
				if(nums[mid]+nums[i] >= lower) {
					lidx = mid;
					r = mid-1;
				} else {
					l = mid+1;
				}
			}

			if(lidx == -1) continue;
			l=lidx;
			r=i-1;
			while(l <= r) {
				int mid = l + (r-l)/2;
				if(nums[mid]+nums[i] <= upper) {
					ridx = mid;
					l = mid+1;
				} else {
					r = mid-1;
				}
			}

			last = Math.max(ridx-lidx+1, 0);
		}

		res += last;
	}

	return res;
}
}