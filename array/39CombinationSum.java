/*
Given a set of candidate numbers (C) (without duplicates) and a target number (T), 
find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
For example, given candidate set [2, 3, 6, 7] and target 7, 
A solution set is: 
[
  [7],
  [2, 2, 3]
]
*/

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates); 
        List<List<Integer>> result = new ArrayList<>();
        if(candidates==null || candidates.length==0)
            return result;
        search(candidates,0,target,new ArrayList<Integer>(), result);
        return result;
    }
    public void search(int[] nums, int start, int target, 
                       ArrayList<Integer> item, List<List<Integer>> result){
        // if(target < 0)
        //     return;
        if(target == 0){
            result.add(new ArrayList<Integer>(item));
            //关键为什么不能直接additem
            //result.add(item);
            return;
        }
        //关键item存的是什么
        //为什么是从start而不是start+1开始
        //
        for(int i=start;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            item.add(nums[i]);
            if(target-nums[i]>=0)
                search(nums,i,target-nums[i],item,result);
            item.remove(item.size()-1);
        }
    }
}