// LeetCode Problem: Build an Array from permutation
// Difficulty: Easy
// Topic: Arrays

class Solution {
    public int[] buildArray(int[] nums) {
       int ans[] = new int[nums.length];
       for(int i =0; i<nums.length; i++){
        ans[i] = nums[nums[i]];
       }
       return ans;
    }
}