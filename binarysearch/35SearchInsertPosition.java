class Solution {
    public int searchInsert(int[] nums, int target) {
        //找插入target的下标
        //相当于找到第一个大于等于target的元素下标
        //如果没有就插入到最后
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }
}