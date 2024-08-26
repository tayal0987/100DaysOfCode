// Rotate image 

// class Solution {
//     public void rotate(int[][] matrix) {

//         int length = matrix.length;
//         for (int i = 0; i < length; i++) {
//             for (int j = i + 1; j < length; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }
//         for (int i = 0; i < length; i++) {
//             for (int j = 0; j < length / 2; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[i][length - 1 - j];
//                 matrix[i][length - 1 - j] = temp;

//             }
//         }
//     }
// }


// Number of good pairs 

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count++;
    }
}




