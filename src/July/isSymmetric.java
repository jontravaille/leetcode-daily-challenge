public boolean isSymmetric(TreeNode root) {
	/*
		given a binary, check whether it is a mirror of itself
	*/	

// first solution iterative
// 	if (root == null) return true;

// 	return helper(root, root);
// }

// private boolean helper(TreeNode t1, TreeNode t2) {
// 	if (t1 == null && t2 == null) return true;

// 	if ((t1 == null || t2 == null) || (t1.val != t2.val)) return false;	

// 	return helper(t1.left, t2.right) && helper(t1.right, t2.left);

// second solution: iterative
	if (root == null) return true;
	Queue<TreeNode> queue = new LinkedList<>();

	queue.offer(root);
	queue.offer(root);
	while (!queue.isEmpty()) {
		TreeNode t1 = queue.poll(), t2 = queue.poll();
		if (t1 == null && t2 == null) continue;
		if (t1 == null || t2 || null) return false;
		if (t1.val != t2.val) return false;
		queue.offer(t1.left);
		queue.offer(t2.right);
		queue.offer(t1.right);
		queue.offer(t2.left);
	}

	return true;
}
