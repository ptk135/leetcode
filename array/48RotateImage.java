class Solution {
    public void rotate(int[][] matrix) {
        if(matrix==null || matrix.length==0)
            return;
        int layer = matrix.length/2;
        for(int i=0; i<layer; i++){
            //一行一列的考察 每次不看最后一个元素
            //一行或者一列的尾是下一个行或者列的头
            //不要重复计算
            for(int j=i; j<matrix.length-i-1; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-j-1][i];//上=左
                matrix[matrix.length-j-1][i] = matrix[matrix.length-i-1][matrix.length-j-1];//左等于下
                matrix[matrix.length-i-1][matrix.length-j-1] = matrix[j][matrix.length-i-1];//下等于右
                matrix[j][matrix.length-i-1] = temp;
            }
        }
    }
}