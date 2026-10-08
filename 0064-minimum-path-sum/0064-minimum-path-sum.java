class Solution {
    public int minPathSum(int[][] grid) {
        int x=grid.length;
        int y=grid[0].length;
        for(int i=1;i<x;i++){
            grid[i][0]+=grid[i-1][0];
        }
            for(int j=1;j<y;j++){
                grid[0][j]+=grid[0][j-1];
            }
                for(int i=1;i<x;i++){
                    for(int j=1;j<y;j++){
                        grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
                    }
                }
        return grid[x-1][y-1];      
    }
}