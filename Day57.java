class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        
        // Base cases
        dp[0] = 1; // An empty tree
        dp[1] = 1; // A tree with one node

        // Fill the dp array
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j]; // j is the root
            }
        }
        return dp[n];
    }
}

