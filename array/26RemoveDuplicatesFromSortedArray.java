class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length<1)
            return 0;
        int currentIndex = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[currentIndex] != nums[i]){
                int temp = nums[i];
                nums[i] = nums[currentIndex+1];
                nums[currentIndex+1] = temp;
                currentIndex++;
            }
        }
        return currentIndex+1;
    }
}
