class Solution {
    public int[] twoSum(int[] nums, int target) {
        int Size = nums.length;
        for(int i =0;i<Size-1;i++){
            for(int j=i+1;j<Size;j++){
                 if(nums[i] + nums[j] == target){
                return new int[] {i,j};
                 }
            }
        }
        return new int[] {};
    }
}