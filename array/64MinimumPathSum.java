class Solution {
    public int minPathSum(int[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0)
            return -1;
        int m = grid.length;
        int n = grid[0].length;
        int[] result = new int[n];
        //result[0] = grid[0][0];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(j==0){
                    result[j] = grid[i][j] + result[j];
                }     
                else if(i==0)
	            	result[j] = result[j-1] +grid[i][j];
                else
                    result[j] = Math.min(result[j],result[j-1])+grid[i][j];
            }
        }
        return result[n-1];
    }
}