class Solution {
    public int uniquePaths(int m, int n) {
        if(m<1 || n<1)
            return -1;
        int[] result = new int[n];
        //注意这里对第一列的处理
        //第一列永远是1
        result[0] = 1;
        for(int i=0; i<m; i++){
            for(int j=1; j<n; j++){
                result[j] = result[j] + result[j-1];
            }
        }
        return result[n-1];
    }
}

public int uniquePaths(int m, int n) {  
    double dom = 1;  
    double dedom = 1;  
    int small = m<n? m-1:n-1;  
    int big = m<n? n-1:m-1;  
    for(int i=1;i<=small;i++)  
    {  
        dedom *= i;  
        dom *= small+big+1-i;  
    }  
    return (int)(dom/dedom);  
}