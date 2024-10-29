class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int sum = 0;
        int ans = 0;
        // Initialize the hashmap with the sum of 0 occurring once
        hash.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            // Check if there is a subarray (ending at i) which sums to k
            if (hash.containsKey(sum - k)) {
                ans += hash.get(sum - k);
            }
            // Update the hashmap with the current sum
            hash.put(sum, hash.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
