public class Solution {
public int[] searchRange(int[] nums, int target) {
    int[] result = new int[2];
    //找到第一个等于target的元素的下标
    result[0] = findFirst(nums, target);
    //找到最后一个等于target的元素的下标
    result[1] = findLast(nums, target);
    return result;
}

private int findFirst(int[] nums, int target){
    int left = 0;
    int right = nums.length-1;
    while(left<=right){
        int mid = (left+right)/2;
        if(nums[mid] < target)
            left = mid+1;
        else
            right = mid -1;
    }
    //此时left对应的是第一个target应该插入的位置，
    //即left==nums.length（原数组中全部小于target）,
    //或者nums[left]是第一个大于等于target的元素;
    if(left==nums.length || nums[left]!=target)
        return -1;
    return left;
}

private int findLast(int[] nums, int target){
    int left= 0;
    int right = nums.length-1;
    while(left<=right){
        int mid = (left+right)/2;
        if(nums[mid] > target)
            right = mid-1;
        else
            left = mid+1;
    }
    //此时left对应的是最后一个target应该插入的位置，
    //nums[left]是第一个大于target的元素
    if(nums.length!=0 && left>=1 && nums[left-1]==target)
        return left-1;
    return -1;
}
}