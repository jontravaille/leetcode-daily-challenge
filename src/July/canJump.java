public boolean canJump(int[] nums) {
	// edge case

	// scenario

	// declare "max" variable which records the maximum jump

	// iterate nums array through for loop

	// condition should exist, if incrementing index cannot be reached by the amount of "max",

	// condition should return false, otherwise keep iterating

    // if (nums.length < 1) return false;

    // boolean[] dp = new boolean[nums.length];
    // dp[0] = true;

    // for (int i = 0; i < nums.length; i++) {
    //     if (!dp[i]) return false;
    //     int max = Math.min(nums.length, i + nums[i] + 1);
    //     for (int j = i + 1; j < max; j++) {
    //         if (!dp[j]) dp[j] = true;
    //     }
    // }
    // return dp[nums.length - 1];


    // Second Solution: Greedy
    // [2, 3, 1, 1, 4]

    int lastPos = nums.length - 1;
    for (int i = nums.length - 1; i >= 0; i--) {
    	if (i + nums[i] >= lastPos) {
    		lastPos = i;
    	}
    }
    return lastPos == 0;
}