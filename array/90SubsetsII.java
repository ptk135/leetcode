class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result;
        if(nums==null || nums.length==0)
            return null;
        Arrays.sort(nums);
        result = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        int start = 0;
        //思路是遇到重复的话，只在现有后一半的结果中加入当前元素
        for(int i=0; i<nums.length; i++){
            //注意这里代码的顺序
            int size = result.size();
            for(int j=start; j<size; j++){
                List<Integer> item = new ArrayList<Integer>(result.get(j));
                item.add(nums[i]);
                result.add(item);
            }
            if(i<nums.length-1 && nums[i]!=nums[i+1])
                start = 0;
            else
                start = size;
        }
        return result;
    }
}