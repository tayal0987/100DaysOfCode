class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Handle empty array case

        int n = 1; // Pointer for the position to place the next unique element
        int count = 1; // Count occurrences of the current number

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1; // Reset count for a new number
            }
            // Allow at most two occurrences
            if (count <= 2) {
                nums[n] = nums[i];
                n++;
            }
        }
        return n; // Length of the modified array
    }
}
