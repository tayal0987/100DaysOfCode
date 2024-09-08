class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int mapS[] = new int[256];
        int mapT[] = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // now we check the characters is mapped
            if (mapS[charS] == 0 && mapT[charT] == 0) {

                // charS to charT
                mapS[charS] = charT;
                // charT to charS
                mapT[charT] = charS;

            } 
            else if (mapS[charS] != charT && mapT[charT] != charS) {
                return false;
            }
        }
        return true;
    }
}



