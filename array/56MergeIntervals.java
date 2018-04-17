class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        //不忘记处理null的情况,这种题先吧结果变量创建好
        List<Interval> result = new ArrayList<Interval>();
        if(intervals==null || intervals.size()==0)
            return result;
        Collections.sort(intervals, new Comparator<Interval>(){
           public int compare(Interval a, Interval b) {
               if(a.start != b.start)
                   return a.start-b.start;
               return a.end-b.end;
           }
        });
        Interval pre = intervals.get(0);
        //是向空的结果中一个一个加入
        for(int i=1; i<intervals.size(); i++){
            Interval current = intervals.get(i);
            if(current.start <= pre.end){
                pre.end = Math.max(current.end, pre.end);
            }
            else{
                result.add(new Interval(pre.start, pre.end));
                pre = current;
            }
        }
        result.add(pre);
        return result;
    }
}