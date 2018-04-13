class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); 
        List<List<Integer>> result = new ArrayList<>();
        if(candidates==null || candidates.length==0)
            return result;
        search(candidates,0,target,new ArrayList<Integer>(), result);
        return result;
    }
    public void search(int[] nums, int start, int target, 
                       ArrayList<Integer> item, List<List<Integer>> result){
        if(target < 0)
            return;
        if(target == 0){
            result.add(new ArrayList<Integer>(item));
            return;
        }
        for(int i=start;i<nums.length;i++){
            //元素不可以重复使用 值去掉子解中的重复
            //这里要去掉的是子解中的重复 所以i>start
            if(i>start && nums[i]==nums[i-1])
                continue;
            item.add(nums[i]);
            if(target-nums[i]>=0)
                search(nums,i+1,target-nums[i],item,result);
            item.remove(item.size()-1);
        }
    }
}