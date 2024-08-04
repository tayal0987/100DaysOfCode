// Remove Duplicates from Sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        int Start = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[Start] != nums[i]) {
                Start++;
                nums[Start] = nums[i];
            }
        }
        return Start + 1;

    }
}
