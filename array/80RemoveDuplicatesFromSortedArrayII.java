class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null)
            return 0;
        if(nums.length<3)
            return nums.length;
        int currentIndex = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[currentIndex]){
                int temp = nums[currentIndex+1];
                nums[currentIndex+1] = nums[i];
                nums[i] = temp;
                currentIndex++;
            }
            else if(nums[i] == nums[currentIndex] && ((currentIndex>0 && nums[currentIndex]!=nums[currentIndex-1]) || currentIndex==0)){
                int temp = nums[currentIndex+1];
                nums[currentIndex+1] = nums[i];
                nums[i] = temp;
                currentIndex++;
            }
            else{
                
            }
        }
        return currentIndex+1;
    }
}