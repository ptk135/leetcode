class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        if(n<=0)
            return result;
        int current = 1;
        int x = 0;
        int y = 0;
        while(n>0){
            if(n==1){
                result[x][y] = current;
                return result;
            }
            //这里也是注意一下边界是n-1
            for(int i=0; i<n-1; i++) 
                result[x][y++] = current++;
            for(int i=0; i<n-1; i++) 
                result[x++][y] = current++;
            for(int i=0; i<n-1; i++) 
                result[x][y--] = current++;
            for(int i=0; i<n-1; i++) 
                result[x--][y] = current++;
            x++;
            y++;
            n=n-2;
        }     
        return result;
    }
}