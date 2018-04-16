class Solution {
    public boolean canJump(int[] nums) {
        if(nums==null || nums.length==0)
            return false;
        int reach = nums[0];
        //i<=reach这个条件是为了防止有2000001这种
        for(int i=0; i<=reach&&i<nums.length; i++){
            if(reach>=nums.length-1)
                return true;
            reach = Math.max(reach,nums[i]+i);
        }
        return false;
    }
}