class Solution {
    public int[] plusOne(int[] digits) {
        if(digits==null || digits.length==0)
            return digits;
        int up = (digits[digits.length-1] +1)/10;
        digits[digits.length-1] = (digits[digits.length-1] +1)%10;
        //这里要注意 后面要用到的变量不要被被前面的覆盖掉了
        int temp;
        //这里注意停止的第一个条件，没有进位就停止
        for(int i=digits.length-2; up!=0 && i>=0; i--){
            temp = digits[i];
            digits[i] = (temp + up)%10;
            up = (temp + up)/10;
        }
        //只有确定最后有进位才生成新的数组
        if(up!=0){
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for(int i=1; i<=digits.length; i++)
                result[i] = digits[i-1];
            return result;
        }
        return digits;
    }
}