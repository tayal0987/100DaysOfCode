class Solution {
    public boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        int Length = s.length();

        for (int i = 0; i < Length; i++) {
            if (s.charAt(i) == 'A') {
                a++;
            }
            if (s.charAt(i) == 'L') {
                l++;
                if (l > 2) {
                    return false;
                }
            } else {
                l = 0; 
            }
            if (a >= 2) {
                return false;
            }
        }
        return true; 
    }
}