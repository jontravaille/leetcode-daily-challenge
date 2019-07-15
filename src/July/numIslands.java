public int numIslands(char[][] grid) {
	/*
	Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
	An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
	You may assume all four edges of the grid are all surrounded by water.

	11111
	00000
	11000
	10011
	00001
	*/

	int island = 0;
	if (grid.length < 1) return island;

	for (int i = 0; i < grid.length; i++) {
		for (int j = 0; j < grid[0].length; j++) {
			if (grid[i][j] == '1') {
				dfs(i, j, grid);
				island++;
			}
		}
	}

	return island;
}

private void dfs(int i, int j, char[][] grid) {
	if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1 || grid[i][j] == '0') return;

	grid[i][j] = '0';
	dfs(i - 1, j, grid);
	dfs(i + 1, j, grid);
	dfs(i, j - 1, grid);
	dfs(i, j + 1, grid);
}
