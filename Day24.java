class Solution {
    public String intToRoman(int num) {

        int[] integer = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] Roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder str = new StringBuilder();
        int length = integer.length;

        for(int i= 0;i<length;i++){

            while(num >= integer[i]){
                num -= integer[i];
                str.append(Roman[i]);
            }
        }
        return str.toString();
    }
}