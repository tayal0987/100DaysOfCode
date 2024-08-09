// Missing NUmber 


class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int s1 = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        int MissNum = s1 - sum;
        return MissNum;

    }
}

// Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }
}