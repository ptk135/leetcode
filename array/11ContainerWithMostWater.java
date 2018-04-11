class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        if(height==null || height.length<2)
            return 0;
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left<right){
            if(max < Math.min(height[left],height[right])*(right-left))
                max = Math.min(height[left],height[right])*(right-left);
            if(height[left] < height[right])
                left++;
            else 
                right--;
        }
        return max;
    }
}