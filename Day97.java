class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // If mid element is greater than the rightmost element,
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // The minimum is in the left half (including mid)
                right = mid;
            }
        }
        // At the end of the loop, left == right and points to the minimum element
        return nums[left];
    }
}