public boolean isPalindrome(int x) {
	/*
	Example 121 - true
	Example -121 - false
	Example 10 - false
	Could you solve it without converting the integer to a string
	*/	
	
	// Simple solution
	// String str = Integer.toString(x);

	// for (int i = 0; i < str.length() / 2; i++) {
	// 	if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
	// 		return false;
	// 	}
	// }

	// return true;

	// more sophisticated solution compared to solution one: not mine
	// String str = String.valueOf(x);
	// int start = 0, end = str.length() - 1;
	// while (start <= end) {
	// 	if (str.charAt(start++) != str.charAt(end--)) return false;
	// }

	// return true;

	// Third solution: not mine

	if (x < 0) return false;
	int reversed = 0, remainder, original = x;

	while (x != 0) {
		remainder = x % 10;
		reversed = reversed * 10 + remainder;
		x /= 10;
	}

	return original == reversed;
}
