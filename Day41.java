class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;

        for (int i = 0; i < chalk.length; i++) {
            sum += chalk[i];
        }
        // Reduce k by the total sum until it fits within the range
        k = (int) (k % sum);

        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i; 
            }
            k -= chalk[i];
        }
        return 0; // Fallback, should not reach here
    }
}





