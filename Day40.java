class Solution {
    public int trap(int[] height) {
        int length = height.length;
        if (length == 0) {
            return 0;
        }
        int left = 0;
        int right = length - 1;
        int leftmax = height[left];
        int rightmax = height[right];
        int ans = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                leftmax = Math.max(leftmax, height[left]);
                ans += leftmax - height[left];
                left++;
            } else {
                rightmax = Math.max(rightmax, height[right]);
                ans += rightmax - height[right];
                right--;
            }
        }
        return ans;
    }
}


