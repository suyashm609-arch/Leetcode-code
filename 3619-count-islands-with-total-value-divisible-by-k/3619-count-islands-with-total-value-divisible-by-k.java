class Solution {
    public int countIslands(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    java.util.Stack<Integer> s = new java.util.Stack<>();
                    s.push(i * n + j);
                    long sum = 0;
                    while (!s.isEmpty()) {
                        int x = s.pop();
                        int r = x / n, c = x % n;
                        if (grid[r][c] == 0) continue;
                        sum += grid[r][c];
                        grid[r][c] = 0;
                        if (r > 0 && grid[r-1][c] > 0)   s.push((r-1) * n + c);
                        if (r < m-1 && grid[r+1][c] > 0) s.push((r+1) * n + c);
                        if (c > 0 && grid[r][c-1] > 0)   s.push(r * n + c-1);
                        if (c < n-1 && grid[r][c+1] > 0)   s.push(r * n + c+1);
                    }
                    if (sum % k == 0) count++;
                }
            }
        }
        return count;
    }
}
