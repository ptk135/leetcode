class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length<1)
            return 0;
        //注意这里没有赋值为0，而是nums[0]
        int global = nums[0];
        int local = nums[0];
        //local是包含当前元素的局部解
        for(int i=1; i<nums.length; i++){
            local = local+nums[i]<nums[i]?nums[i]:nums[i]+local;
            global = Math.max(global, local);
        }
        return global;
    }
}