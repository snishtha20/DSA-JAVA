// LeetCode Problem: Kth largest element
// Difficulty: Medium
// Topic: Arrays
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
