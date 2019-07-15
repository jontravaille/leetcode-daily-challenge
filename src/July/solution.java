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

	public String addBinary(String a, String b) {
//		 First, consider whether there's an edge case

//		 Check if length of a and b are the same

//		 if not, make the shorter one to become the same length

//		 and then compare from the last index to first

//		 if overflow exists append 1 to the front of output

//		 a = a.length() < b.length() ? zeroAppender(b, a) : a;
//		 b = a.length() > b.length() ? zeroAppender(a, b) : b;

//		 int carry = 0;
//		 StringBuilder sb = new StringBuilder();

//		 for (int i = a.length() - 1; i >= 0; i--) {
//		 	int aToInt = a.charAt(i) - '0'; //
//		 	int bToInt = b.charAt(i) - '0'; //
//		 	int sum = carry + aToInt + bToInt;

//		 	switch (sum) {
//		 		case 1:
//		 			output = "1" + output;
//		 			carry = 0;
//		 			break;
//		 		case 2:
//		 			output = "0" + output;
//		 			carry = 1;
//		 			break;
//		 		case 3:
//		 			output = "1" + output;
//		 			carry = 1;
//		 			break;
//		 		default:
//		 			output = "0" + output;
//		 			carry = 0;
//		 	}
//		 }

//		 return carry != 0 ? "1" + output : output;

		 a = a.length() < b.length() ? zeroAppender(b, a) : a;
		 b = a.length() > b.length() ? zeroAppender(a, b) : b;

		 int carry = 0;
		 StringBuilder sb = new StringBuilder();
		 int i = a.length() - 1, j = b.length() - 1;
		 while (i >= 0 || j >= 0 || carry != 0) {
		 	int sum = carry;
		 	if (i >= 0) sum += a.charAt(i--) - '0';
			if (j >= 0) sum += b.charAt(j--) - '0';
			carry = sum >> 1;

			if (sum % 2 == 0) sb.append('0');
			else sb.append('1');
		}

		 return sb.reverse().toString();
	}

	private String zeroAppender(String longStr, String shortStr) {
		while (longStr.length() != shortStr.length()) {
			shortStr = "0" + shortStr;
		}

		return shortStr;
	}

	public static void main(String[] args) {
		System.out.println('hello');
	}
}

