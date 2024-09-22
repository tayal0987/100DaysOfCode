class Solution {
    public int findLUSlength(String a, String b) {
        // Get the lengths of both strings
        int x = a.length();
        int y = b.length();

        // Check if both strings are equal
        if (a.equals(b)) {
            return -1; // If they are the same, return -1
        } else {
            // Return the length of the longer string
            return Math.max(x, y);
        }
    }
}
