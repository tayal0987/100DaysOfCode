// Power o Two 

class Solution {
    public boolean isPowerOfTwo(int n) {
        while (n > 0) {
            if (n == 1) {
                return true;
            } else if (n % 2 == 0) {
                n = n / 2;
            } else {
                return false;
            }
        }
        return false;
    }
}

// Power of Three 

// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         while (n > 0) {
//             if (n == 1) {
//                 return true;
//             } else if (n % 3 == 0) {
//                 n = n / 3;
//             } else {
//                 return false;
//             }
//         }
//         return false;
//     }
// }


// Power of Four

// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         while (n > 0) {
//             if (n == 1) {
//                 return true;
//             } else if (n % 4 == 0) {
//                 n = n / 4;
//             } else {
//                 return false;
//             }
//         }
//         return false;
//     }
// }
