class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int temp = nums[0] + nums[1] +nums[2];
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                if(left<right && nums[i] + nums[left] + nums[right]== target)
                    return target;
                while(left<right && nums[i] + nums[left] + nums[right] < target){
                    left++;
                    if(Math.abs(target-temp)>Math.abs(target-nums[i]-nums[left-1]-nums[right]))
                        temp = nums[i]+nums[left-1]+nums[right];
                }
                while(left<right && nums[i] + nums[left] + nums[right] > target){
                    right--;
                    if(Math.abs(target-temp)>Math.abs(target-nums[i]-nums[left]-nums[right+1]))
                        temp = nums[i]+nums[left]+nums[right+1];
                }  
            }
        }
        return temp;    
    }
}