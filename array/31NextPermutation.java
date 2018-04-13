class Solution {
    public void nextPermutation(int[] nums){
        if(nums==null || nums.length<1)
            return;
        int index = nums.length-2;
        while(index>=0 && nums[index]>=nums[index+1]){
            index--;
        }
        if(index>=0){
            int i = nums.length-1;
            while(nums[i]<=nums[index]){
                i--;
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
        reverse(nums, index+1);
    }
    public void reverse(int[] nums, int k){
        int left = k;
        int right = nums.length-1;
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}