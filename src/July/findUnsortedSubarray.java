public int findUnsortedSubarray(int[] nums) {
	// Input: [2, 6, 4, 8, 10, 9, 15]
    int start = -1, end = -2, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    
    for (int i = 0; i < nums.length; i++) {
        max = Math.max(max, nums[i]);
        if (max > nums[i]) end = i;
    }
    
    for (int i = nums.length - 1; i >= 0; i--) {
        min = Math.min(min, nums[i]);
        if (min < nums[i]) start = i;
    }
    
    return end - start + 1;
}
