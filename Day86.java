class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[][] soldiersCount = new int[m][2];

        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            soldiersCount[i][0] = count;
            soldiersCount[i][1] = i; 
        }
        Arrays.sort(soldiersCount, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = soldiersCount[i][1];
        }
        return result;
    }
}
