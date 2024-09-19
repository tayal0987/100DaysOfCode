class Solution {
    public int compress(char[] chars) {
        int writeIndex = 0; 
        int count = 1; 

        for (int i = 1; i <= chars.length; i++) {
            if (i == chars.length || chars[i] != chars[i - 1]) {
                chars[writeIndex++] = chars[i - 1];
                if (count > 1) {
                    for (char digit : Integer.toString(count).toCharArray()) {
                        chars[writeIndex++] = digit;
                    }
                }
                count = 1;
            } else {
                count++;
            }
        }
        return writeIndex; 
    }
}


