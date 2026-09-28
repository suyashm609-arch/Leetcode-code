class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();
        int sx = 0, sy = 0, cnt = 0;
        int[][] id = new int[m][n];
        for (int[] row : id)
            Arrays.fill(row, -1);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c = classroom[i].charAt(j);
                if (c == 'S') {
                    sx = i;
                    sy = j;
                }
                if (c == 'L') {
                    id[i][j] = cnt++;
                }
            }
        }
        if (cnt == 0)  return 0;
        int fullMask = (1 << cnt) - 1;
        boolean[][][][] vis =
            new boolean[m][n][energy + 1][1 << cnt];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sx, sy, energy, fullMask});
        vis[sx][sy][energy][fullMask] = true;
        int moves = 0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int[] cur = q.poll();
                int x = cur[0];
                int y = cur[1];
                int e = cur[2];
                int mask = cur[3];
                if (mask == 0)  return moves;
                if (e == 0)
                    continue;
                for (int k = 0; k < 4; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];
                    if (nx < 0 || nx >= m || ny < 0 || ny >= n)
                        continue;
                    if (classroom[nx].charAt(ny) == 'X')
                        continue;
                    char c = classroom[nx].charAt(ny);
                    int ne = e - 1;
                    int nm=mask;
                    if (c == 'R')
                        ne = energy;
                    if (c == 'L')
                        nm = nm & ~(1 << id[nx][ny]);
                    if (!vis[nx][ny][ne][nm]) {
                        vis[nx][ny][ne][nm] = true;
                        q.add(new int[]{
                            nx, ny, ne, nm
                        });
                    }
                }
            }
            moves++;
        }
        return -1;
    }
}