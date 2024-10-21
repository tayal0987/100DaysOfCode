class Solution {
    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        // grid create
        char[][] grid = new char[n][n];
        for (int i = 0; i < grid.length; i++) {
            Arrays.fill(grid[i], '.');
        }

        solve(grid, 0);
        return ans;
    }

    public void addans(char[][] grid) {
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            String tamp = "";
            for (int j = 0; j < grid.length; j++) {
                tamp += grid[i][j];
            }
            ls.add(tamp);
        }
        ans.add(ls);
    }

    public void solve(char[][] grid, int row) {
        if (row == grid.length) {
            // add ans in list
            addans(grid);
            return;
        }

        for (int i = 0; i < grid.length; i++) {
            if (ispossible(grid, row, i)) {
                grid[row][i] = 'Q';
                solve(grid, row + 1);
                // back track
                grid[row][i] = '.';
            }
        }
    }
    public boolean ispossible(char[][] grid, int row, int col) {
        // upword
        for (int i = row; i >= 0; i--) {
            if (grid[i][col] == 'Q') {
                return false;
            }
        }
        // left dia
        int x = row;
        int y = col;

        while (x >= 0 && y >= 0) {
            if (grid[x][y] == 'Q') {
                return false;
            }
            x--;
            y--;
        }
        // right dia
        x = row;
        y = col;
        while (x >= 0 && y < grid.length) {
            if (grid[x][y] == 'Q') {
                return false;
            }
            x--;
            y++;
        }
        return true;
    }
}



