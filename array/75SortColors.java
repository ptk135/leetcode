class Solution {
    // public void sortColors(int[] nums) {
    //     if(nums==null || nums.length==0)
    //         return;
    //     int[] helper = new int[3];
    //     int[] result = new int[nums.length];
    //     for(int i=0; i<nums.length; i++){
    //         helper[nums[i]]++;
    //     }
    //     for(int i=1; i<3; i++){
    //         helper[i] = helper[i] + helper[i-1];
    //     }
    //     for(int i=0; i<nums.length; i++){
    //         result[helper[nums[i]]-1] = nums[i];
    //         helper[nums[i]]--;
    //     }
    //     for(int i=0; i<nums.length; i++){
    //         nums[i] = result[i];
    //     }
    // }
    public void swap(int[] A, int a, int b) {  
        int tmp = A[a];  
        A[a] = A[b];  
        A[b] = tmp;  
	}  
	      
	public void sortColors(int[] A) {  
        int len = A.length;  
        int i, r = 0, b = 0;  
        for (i = 0; i < len-b; i++) {  
            if (A[i] == 0) {  
                swap(A, i, r);  
                r++;  
            } else if (A[i] == 2) {  
                swap(A, i, len-1-b);  
                b++;  
                i--; //后面交换过来的元素也要进行判断  
            }   
        }  
    } 
}