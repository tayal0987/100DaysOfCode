// Gas Station 

// class Solution {
//     public int canCompleteCircuit(int[] gas, int[] cost) {

//         int a = 0;
//         int b = 0;
//         int start = 0;

//         for (int i = 0; i < gas.length; i++) {
//             b += gas[i] - cost[i];
//             if (b < 0) {
//                 a += b;
//                 b = 0;
//                 start = i + 1;
//             }
//         }
//         if (a + b >= 0) {
//             return start;
//         } else {
//             return -1;
//         }
//     }
// }


// Greatest Common Divisor of Strings

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {

            return "";
        }
        int a = str1.length();
        int b = str2.length();

        // using eucledian algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return str1.substring(0, a);
    }
}