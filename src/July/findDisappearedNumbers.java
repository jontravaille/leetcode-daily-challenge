public List<Integer> findDisappearedNumbers(int[] nums) {
	/*
	[1,2,3,4,5,6,7]
	*/

	// First solution: bool array

	boolean[] dp = new boolean[nums.length + 1];
	List<Integer> list = new LinkedList<>();

	for (int num: nums) dp[num] = true;

	for (int i = 1; i < nums.length + 1; i++) {
		if (!dp[i]) list.add(i);
	}

	return list;

	// Second Solution: change values in the array

	List<Integer> list = new LinkedList<>();

	for (int i = 0; i < nums.length; i++) {
		nums[Math.abs(nums[i]) - 1] = - Math.abs(nums[Math.abs(nums[i]) - 1]);
	}

	for (int i = 0; i < nums.length; i++) {
		if (nums[i] > 0) list.add(i + 1);
	}

	return list;
}
