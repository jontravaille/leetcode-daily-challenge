class public Solution {
	public void moveZeroes(int[] nums) {
		/*
		Given an array nums, write a function to move all 0's to the end of it while
		maintaining the relative order of the non-zero elements.
		Example:
		 - Input: [0, 1, 0, 3, 12]
		 - Output: [1, 3, 12, 0, 0]

		Requirements:
		 - must do this in-place without making a copy of the array.
		 - minimize the total number of operations.	  
		*/

		if (nums.length < 1) return;
		int count = 0;

		// Since the relative order should be maintained, sorting is not a choice.

		// brute solution: nested for-loop

		for (int i = 1; i < nums.length; i++) {
			int item = nums[i];
			int prev = i;
			if (nums[i] != 0) {
				for (int j = i; j >= count; j--) {
					boolean condition = nums[j] == 0;
					if (condition) {	
						nums[j] = item;
						nums[prev] = 0;
						prev = j;
					}
				}
				count ++;
			}
		}

		// solution 2: space sub-optimal
		int zero = 0;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			zero += (nums[i] == 0):
		}

		int[] ret = new int[n];
		int idx = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] != 0) {
				ret[idx] = nums[i];
				idx ++;
			}
		}

		for (int i = 0; i < n; i++) {
			nums[i] = ret[i];
		}


		// solution 3: zero = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[zero++] = nums[i];
			}
		}

		for (int i = zero; i < nums.length; i++) {
			nums[i] = 0;
		}

	}
}
