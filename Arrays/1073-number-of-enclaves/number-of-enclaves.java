import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();

        // Step 1: Add all boundary land cells to the queue and mark them as visited (0)
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1) {
                queue.offer(new int[]{i, 0});
                grid[i][0] = 0;
            }
            if (grid[i][n - 1] == 1) {
                queue.offer(new int[]{i, n - 1});
                grid[i][n - 1] = 0;
            }
        }
        for (int j = 0; j < n; j++) {
            if (grid[0][j] == 1) {
                queue.offer(new int[]{0, j});
                grid[0][j] = 0;
            }
            if (grid[m - 1][j] == 1) {
                queue.offer(new int[]{m - 1, j});
                grid[m - 1][j] = 0;
            }
        }

        // Direction arrays for moving up, down, left, and right
        int[] rowDirs = {-1, 1, 0, 0};
        int[] colDirs = {0, 0, -1, 1};

        // Step 2: Multi-source BFS to eliminate all land connected to boundaries
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0];
            int c = cell[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + rowDirs[i];
                int nc = c + colDirs[i];

                // If neighbor is within bounds and is a land cell
                if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1) {
                    grid[nr][nc] = 0; // Mark as visited immediately to avoid duplicate queue entries
                    queue.offer(new int[]{nr, nc});
                }
            }
        }

        int enclaveCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    enclaveCount++;
                }
            }
        }

        return enclaveCount;
    }
}
