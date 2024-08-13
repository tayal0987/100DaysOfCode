class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int size = nums.length;
        int Count = 0;
        int Max_count = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] == 1) {
                Count++;
                Max_count = Math.max(Max_count, Count);
            } else {
                Count = 0;
            }

        }
        return Max_count;

    }

}