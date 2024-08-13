class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int totalRolls = m + n;
        int requiredSum = mean * totalRolls;
        int currentSum = 0;

        for (int roll : rolls) {
            currentSum += roll;
        }

        int missingSum = requiredSum - currentSum;
        if (missingSum < n || missingSum > 6 * n) {
            return new int[0];
        }

        int[] missingRolls = new int[n];
        int baseValue = missingSum / n;
        int extra = missingSum % n;

        for (int i = 0; i < n; i++) {
            missingRolls[i] = baseValue + (i < extra ? 1 : 0);
        }

        return missingRolls;
    }
}
