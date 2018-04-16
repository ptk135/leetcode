class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
            return result;
        int m = matrix.length;
        int n = matrix[0].length;
        int x = 0;
        int y = 0;
        while(m>0 && n>0){
            if(m==1){
                for(int i=0; i<n; i++)
                    result.add(matrix[x][y++]);
                break;
            }
            else if(n==1){
                for(int i=0; i<m; i++)
                    result.add(matrix[x++][y]);
                break;
            }
            for(int i=0; i<n-1; i++)
                result.add(matrix[x][y++]);
            for(int i=0; i<m-1; i++)
                result.add(matrix[x++][y]);
            for(int i=0; i<n-1; i++)
                result.add(matrix[x][y--]);
            for(int i=0; i<m-1; i++)
                result.add(matrix[x--][y]);
            m = m-2;
            n = n-2;
            x = x+1;
            y = y+1;
        }
        return result;
    }
}