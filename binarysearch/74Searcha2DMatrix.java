class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
            return false;
        int m = matrix.length;
        int n = matrix[0].length;
        
        int top = 0;
        int bot = m-1;
        while(top<=bot){
            int mid = (top+bot)/2;
            if(matrix[mid][0]==target)
                return true;
            else if(matrix[mid][0]>target){
                bot = mid-1;
            }
            else{
                top = mid+1;
            }
        }
        if(top == 0)
            return false;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(matrix[top-1][mid]==target)
                return true;
            else if(matrix[top-1][mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return false;
    }
}