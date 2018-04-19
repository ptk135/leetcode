class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //从后往前比较并插入
        int l1 = m-1;
        int l2 = n-1;
        int index = m+n-1;
        while(l1>=0 && l2>=0){
            int temp = Math.max(nums1[l1],nums2[l2]);
            nums1[index] = temp;
            index--;
            if(nums1[l1]==temp)
                l1--;
            else
                l2--;
        }
        while(l2>=0){
            nums1[index] = nums2[l2];
            index--;
            l2--;
        }
    }
}