class Solution {
    public int minimumLength(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            freq[idx]++;
        }
        int size = 0;
        for (int i = 0; i < freq.length; i++) {
            while(freq[i] > 2) {
                 freq[i] -= 2;
            }
        }
        for (int f : freq) {
           size += f;
        }
        return size;
    }
}