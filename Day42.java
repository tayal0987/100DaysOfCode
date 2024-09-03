class Solution {
    public int getLucky(String s, int k) {
        int n = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = (s.charAt(i) - 'a') + 1;

            while (digit > 0) {
                n += digit % 10;
                digit /= 10;
            }
        }
        // Reduce n k times by summing its digits
        for (int j = 0; j < k - 1; j++) {
            int digit = n;
            n = 0;

            while (digit > 0) {
                n += digit % 10;
                digit /= 10;
            }
        }
        return n; 
    }
}

