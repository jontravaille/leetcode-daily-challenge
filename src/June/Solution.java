package June;

public class Solution {
	public ListNode reverseList(ListNode head) { // 206. Reverse Linked List
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
}
