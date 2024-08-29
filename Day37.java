class Solution {
    public char findTheDifference(String s, String t) {
        char[] c = s.toCharArray();
        char[] ch = t.toCharArray();

        Arrays.sort(c);
        Arrays.sort(ch);

        for (int i = 0; i < c.length; i++) {
            if (c[i] != ch[i]) {
                return ch[i];
            }
        }
        return ch[ch.length - 1];
    }
}

