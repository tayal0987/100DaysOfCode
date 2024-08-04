class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int Start1 = m-1;
        int Start2 = n-1;
        int i = m+n-1;
        while(Start2 >= 0 ){
            if(Start1 >= 0 && nums1[Start1] > nums2[Start2]){
                nums1[i--] = nums1[Start1--];
            }
            else{
                nums1[i--] = nums2[Start2--];
            }
        }
    }
}