package g0101_0200.s0200_number_of_islands;

public class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        if (grid != null && grid.length != 0 && grid[0].length != 0) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1') {
                        dfs(grid, i, j);
                        islands++;
                    }
                }
            }
        }
        return islands;
    }

    private void dfs(char[][] grid, int x, int y) {
        if (x < 0 || grid.length <= x || y < 0 || grid[0].length <= y || grid[x][y] != '1') {
            return;
        }
        grid[x][y] = 'x';
        dfs(grid, x + 1, y);
        dfs(grid, x - 1, y);
        dfs(grid, x, y + 1);
        dfs(grid, x, y - 1);
    }
}
