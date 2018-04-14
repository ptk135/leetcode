class Solution {
    public int trap(int[] height) {
        if(height==null || height.length<=2)
            return 0;
        int left = 0;
        int right = height.length-1;
        int result = 0;
        while(left<right){
            int min = Math.min(height[left],height[right]);
            int current;
            if(min==height[left]){
                current = left+1;
                while(current<right && height[current]<min){
                    result = result + min - height[current];
                    current++;
                }
                left = current;
            }
            else{
                current = right-1;
                while(current>left &&height[current]<min){
                    result = result + min - height[current];
                    current--;
                }
                right = current;
            }
        }
        return result;
    }
}

