class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = 0;
            // Determine the value of the current Roman numeral
            if (currentChar == 'I') {
                currentValue = 1;
            } else if (currentChar == 'V') {
                currentValue = 5;
            } else if (currentChar == 'X') {
                currentValue = 10;
            } else if (currentChar == 'L') {
                currentValue = 50;
            } else if (currentChar == 'C') {
                currentValue = 100;
            } else if (currentChar == 'D') {
                currentValue = 500;
            } else if (currentChar == 'M') {
                currentValue = 1000;
            }
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue; // Update the previous value
        }
        return total;
    }
}
