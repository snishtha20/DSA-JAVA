// LeetCode Problem: Missing number
// Difficulty: Medium
// Topic: Arrays

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int S = (n*(n+1))/2;
        int s =0;
        for(int num: nums){
            s += num;
        }
        int miss = S-s;
        return miss;
    }
}
