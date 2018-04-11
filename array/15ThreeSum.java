class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(i>0){
                if(nums[i]==nums[i-1])
                    continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                while(left<right && nums[i]+nums[left]+nums[right]<0){
                    left++;
                }
                while(left<right && nums[i]+nums[left]+nums[right]>0){
                    right--;
                }
                if(left<right && nums[i]+nums[left]+nums[right]==0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);
                    do{
                        left++;
                    }while(left<right && nums[left] == nums[left-1]);
                    do{
                        right--;
                    }while(left<right && nums[right] == nums[right+1]);
                }
            }
        }
        return result;
    }
}