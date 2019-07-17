public List<String> generateParenthesis(int n) {
	List<String> list = new ArrayList<>();
	if (n < 1) return list;

	dfs(list, "", 0, 0, n);

	return list;
}

private void dfs(List<String> list, String str, int open, int close, int n) {
	// if string length is twice the size
	if (str.length() == n * 2) {
		list.add(str);
		return;
	}
	if (open < n) {
		dfs(list, str + "(", open + 1, close, n);
	}
		// if left brace is available, recurse again
		// if not, add curly braces
	if (close < n && open > close) {
	 	dfs(list, str + ")", open, close + 1, n);
	}

}
