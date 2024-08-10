class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0)
            return result;

        int n = matrix.length;
        int m = matrix[0].length;
        int rs = 0;
        int re = n - 1;
        int cs = 0;
        int ce = m - 1;
        while (rs <= re && cs <= ce) {
            // Traverse from left to right
            for (int col = cs; col <= ce; col++) {
                result.add(matrix[rs][col]);
            }
            rs++;
            // Traverse from top to bottom
            for (int row = rs; row <= re; row++) {
                result.add(matrix[row][ce]);
            }
            ce--;
            if (rs <= re) {
                // Traverse from right to left
                for (int col = ce; col >= cs; col--) {
                    result.add(matrix[re][col]);
                }
                re--;
            }
            if (cs <= ce) {
                // Traverse from bottom to top
                for (int row = re; row >= rs; row--) {
                    result.add(matrix[row][cs]);
                }
                cs++;
            }
        }
        return result;
    }
}
