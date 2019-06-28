package June;

public class Solution {
	public ListNode reverseList(ListNode head) { // 206. Reverse Linked List (June 27)
		/*
		1 -> 2 -> 3 -> 4 -> 5 -> NULL

		5 -> 4 -> 3 -> 2 -> 1 -> NULL

		1 -> NULL
		1 -> 2 -> 3 -> 4 -> 5 -> NULL

		2 -> 1 -> NULL
		 */

		ListNode curr = null;
		ListNode temp = head;

		while (temp != null) {
			temp = temp.next;
			head.next = curr;
			curr = head;
			head = temp;
		}

		return curr;
	}

	public int rob(int[] nums) { // 198. House Robber (June 28)
		/*
		Find a maximum amount of money that a thief can rob without alerting the police.
		A house will contact the police if two adjacent houses were broken into on the same night.

		[1, 2, 3, 1]

		[2, 1, 1, 2]
		 */

		// edge case
		if (nums.length < 1) return 0;

		// define variable
		int max = Integer.MIN_VALUE;
		int prevRobbed = 0;
		int prevNotRobbed = 0;

		for (int num: nums) {
			int currRob = prevNotRobbed + num;
			int currNotRob = Math.max(prevRobbed, prevNotRobbed);
			// solved in second try - line 49 is important in a sense that max currNotRob has two choices:
			// whether currNotRob should have a value of prevRobbed or prevNotRobbed since
			// Both choices have a possibility of not robbing currently

			max = Math.max(currRob, currNotRob);

			prevRobbed = currRob;
			prevNotRobbed = currNotRob;
		}

		return max;
	}
}
