private int count = 0;
// public TreeNode convertBST(TreeNode root) {
// 	// TreeNode solution
// 	if (root == null) return null;

// 	helper(root);

// 	return root;
// }

// private void helper(TreeNode root) {
// 	if (root == null) return;
// 	helper(root.right);
// 	root.val += count;
// 	count = root.val;
// 	helper(root.left);
// }

// public TreeNode convertBST(TreeNode root) {
// 	if (root == null) return null;
// 	else {
// 		convertBST(root.right);
// 		root.val += count;
// 		count = root.val;
// 		convertBst(root.left);
// 	}

// 	return root;
// }


// confused part
public TreeNode convertBST(TreeNode root) {
    if (root == null) return null;
    TreeNode node = root;
    Stack<TreeNode> stack = new Stack<>();

    while (!stack.isEmpty() || node != null) {
        while (node != null) {
            stack.push(node);
            node = node.right;
        }
        node = stack.pop();
        node.val += count;
        count = node.val;
        
        node = node.left;
    }

    return root;
}   