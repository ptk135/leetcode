class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid==null || obstacleGrid[0].length==0)
            return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] result = new int[n];
        result[0] = obstacleGrid[0][0]==1?0:1;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                //注意这里分的两种情况 巧妙处理了第一列
                if(obstacleGrid[i][j]==1)
                    result[j] = 0;
                else if(j!=0)
                    result[j] = result[j] + result[j-1];
            }
        }
        return result[n-1];
    }
}