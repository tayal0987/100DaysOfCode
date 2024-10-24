class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String res = "";
        for(int i = 0;i<nums.length;i++){
            if(nums[i].charAt(i) == '1'){
                res+='0';
            }
            else{
                res+='1';
            }
        }
        return res; 
    }
}