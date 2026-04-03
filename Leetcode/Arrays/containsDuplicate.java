// LeetCode Problem: Contains duplicate
// Difficulty: Easy
// Topic: Arrays, sorting


class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int x =0;
        for(int i=1; i<nums.length; i++){
            if(nums[x] == nums[i]){                
                return true;                
            }
            else{
                x =x+1;
            }
        }
        return false;
    }
}
