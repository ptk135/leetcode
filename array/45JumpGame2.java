class Solution {
    public int jump(int[] nums) {
        if(nums==null && nums.length==0)
            return -1;
        int left = 0;
        int right = 0;
        int reach = 0;
        int result = 0;
        while(left<=right){
            //要先判断，否则后面有可能越界
            if(reach >= nums.length-1)
                return result;
            for(int i=left; i<=right; i++){
                reach = Math.max(reach,nums[i]+i);
            }
            left = right+1;
            right = reach;
            result++;
        }     
        return -1;
    }
}