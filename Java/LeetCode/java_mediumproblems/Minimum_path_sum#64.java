/*
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
Note: You can only move either down or right at any point in time.
*/

class Solution {
    public int calculate(int[][] grid, int i, int j)
     {
       if (i == grid.length || j == grid[0].length)
       {
       return Integer.MAX_VALUE;
       }
       if (i == grid.length - 1 && j == grid[0].length - 1)
       {
       return grid[i][j];
       }
       return grid[i][j] +
       Math.min(calculate(grid, i + 1, j), calculate(grid, i, j + 1));
     }
    public int minPathSum(int[][] grid) {
        return calculate(grid, 0, 0);
    }
}

/*
Video explaination:-https://youtu.be/t1shZ8_s6jc
*/