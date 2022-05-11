import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid == null) return 0;

        int numberOfIslands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    bfs(grid, i, j);
                    numberOfIslands += 1;
                }
            }
        }
        return numberOfIslands;
    }

    public void bfs (char[][] grid, int row, int col) {

        if(row < 0 || row >= grid.length ||
            col < 0 || col >= grid[row].length ||
             grid[row][col] == '0') {
            return;
        }

        grid[row][col] = '0';
        bfs(grid, row + 1, col);
        bfs(grid, row - 1, col);
        bfs(grid, row, col + 1);
        bfs(grid, row, col - 1);
    }
}
