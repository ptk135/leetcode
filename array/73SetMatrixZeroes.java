class Solution {
    public void setZeroes(int[][] matrix) {
        //用首行和首列中的元素代表一行或列是否为零
        //然后用另外两个变量表示第一行和第一列的情况
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
            return;
        int m = matrix.length;
        int n = matrix[0].length;
        boolean row=true;
        boolean colum=true;
        for(int i=0; i<m; i++){
            if(matrix[i][0] == 0){
                colum = false;
                break;
            }
        }
        for(int i=0; i<n; i++){
            if(matrix[0][i] == 0){
                row = false;
                break;
            }
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][0]==0 || matrix[0][j] == 0){
                    matrix[i][j]=0;
                }
            }
        }
        
        if(row==false){
            for(int i=0; i<n; i++)
                matrix[0][i] = 0;
        }
        if(colum==false){
            for(int i=0; i<m; i++)
                matrix[i][0] = 0;
        }
    }
}