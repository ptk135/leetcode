class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums==null || nums.length<1)
            return 0;
        int left = 0; 
        int right = nums.length-1;
        while(left<right){
            if(nums[left]==val){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                right--;
            }
            else{
                left++;
            }
        }
        //关键
        if(nums[left] == val)
            left--;
        return left+1;
    }
}