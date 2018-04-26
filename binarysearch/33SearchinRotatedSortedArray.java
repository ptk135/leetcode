class Solution {
    public int search(int[] nums, int target) {
        if(nums==null || nums.length==0)
            return -1;
        int left = 0;
        int right = nums.length-1;
        int mid = -1;
        while(left<=right){
            mid = (left+right)/2;
            if(nums[mid]==target)
                return mid;
            
            if(nums[mid]<nums[right]){
                if(target>nums[mid]){
                   if(target>nums[right]) 
                       right = mid-1;
                    else
                        left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            else{
                if(target>nums[mid]){
                    left = mid+1;
                }
                else{
                    if(target<nums[left])
                        left = mid+1;
                    else
                        right = mid-1;
                }
            }
        }
        return -1;
    }
}