// Uglu number 

// class Solution {
//     public boolean isUgly(int n) {
//         if (n <= 0) {
//             return false;
//         }
//         while (n % 2 == 0) {
//             n = n / 2;
//         }
//         while (n % 3 == 0) {
//             n = n / 3;
//         }
//         while (n % 5 == 0) {
//             n = n / 5;
//         }
//         return n == 1;

//     }
// }



// Plus one 

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;

        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }
}
