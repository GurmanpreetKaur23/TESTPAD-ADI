class Result {
    static int shortestPath(int[][] mat, int srcR, int srcC, int destR, int destC, int m, int n) {
        if (mat[srcR][srcC] == 0 || mat[destR][destC] == 0) return -1;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        queue.add(new int[]{srcR, srcC, 0});
        visited[srcR][srcC] = true;
        
        int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            if (curr[0] == destR && curr[1] == destC) return curr[2];
            for (int i = 0; i < 4; i++) {
                int x = curr[0] + dx[i], y = curr[1] + dy[i];
                if (x >= 0 && y >= 0 && x < m && y < n && mat[x][y] == 1 && !visited[x][y]) {
                    visited[x][y] = true;
                    queue.add(new int[]{x, y, curr[2] + 1});
                }
            }
        }
        return -1;
    }
}
