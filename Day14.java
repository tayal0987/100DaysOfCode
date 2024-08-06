class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths are not equal, they can't be anagrams
        if(s.length() != t.length()){
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        // compare the arrays
        return Arrays.equals(sArr, tArr);
    }
}
