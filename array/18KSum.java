class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            return ksum(nums,0,4,target);
        }
        public List<List<Integer>> ksum(int[] nums, int start, int k, int target){
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            if(k==2){
                int left = start;
                int right = nums.length-1;
                while(left<right){
                    //注意
                    if(left<right && nums[left]+nums[right]==target){
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        result.add(temp);
                        //关键
                        do{
                            left++;
                        }while(left<right && nums[left]==nums[left-1]);
                        do{
                            right--;
                        }while(left<right && nums[right]==nums[right+1]);
                           
                    }
                    //注意
                    while(left<right && nums[left]+nums[right]>target){
                        right--;
                    }
                    //注意
                    while(left<right && nums[left]+nums[right]<target){
                        left++;
                    }
                }
            }
            else{
                for(int i=start; i<nums.length-k+1; i++){
                    //关键
                    if(i>start && nums[i]==nums[i-1])
                        continue;
                    List<List<Integer>> ans = ksum(nums,i+1,k-1,target-nums[i]);
                    if(ans != null){
                        List<Integer> temp = new ArrayList<Integer>();
                        //关键
                        for(List<Integer> item: ans){
                            item.add(0,nums[i]);
                            result.add(item);
                        }
                    }
                }
            }            
             return result;      
        }    
}