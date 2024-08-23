// Toeplitz Matrix

// class Solution {
//     public boolean isToeplitzMatrix(int[][] matrix) {
//         int row = matrix.length;
//         int col = matrix[0].length;

//         for(int i = 0; i < row - 1; i++){
//             for(int j = 0; j < col-1; j++){
//                 if(matrix[i][j] != matrix[i+1][j+1]){
//                     return false;
//                 }
//             }
//         }
//         return true;
        
//     }
// }

// Matrix Diagonal Sum

class Solution {
    public int diagonalSum(int[][] mat) {
        int TotalSum = 0;
        int length = mat.length;
        ;

        for (int i = 0; i < length; i++) {
            TotalSum += mat[i][i] + mat[i][length - i - 1];
        }

        if (length % 2 != 0) {
            TotalSum -= mat[length / 2][length / 2];
        }
        return TotalSum;
    }
}