// LeetCode Problem: Maximum Subarray
// Difficulty: Medium
// Topic: Arrays

class Solution {
    public int maxSubArray(int[] nums) {
        int cs = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0; i<nums.length; i++){
            cs = Math.max(nums[i], cs+nums[i]);
            max = Math.max(cs, max);
        }
        return max;
    }
}