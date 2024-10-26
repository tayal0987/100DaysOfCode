class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutation = new ArrayList<>();
        backtrack(new ArrayList<>(), nums, permutation);
        return permutation;
    }

    static void backtrack(ArrayList<Integer> current, int[] nums, List<List<Integer>> permutation) {
        if (current.size() == nums.length) {
            permutation.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (current.contains(nums[i])) continue; // Skip if already used
            current.add(nums[i]);
            backtrack(current, nums, permutation);
            current.remove(current.size() - 1); // Backtrack
        }
    }
}