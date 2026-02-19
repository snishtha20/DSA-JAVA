// LeetCode Problem: Trapping Rain Water
// Difficulty: Hard
// Topic: Arrays

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int Leftmax[] = new int[n];
        Leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            Leftmax[i] = Math.max(height[i], Leftmax[i-1]);
        }
        int Rightmax[] = new int[n];
        Rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            Rightmax[i] = Math.max(height[i], Rightmax[i+1]);
        }
        int trappedWater = 0;
        for(int i =0; i<n; i++){
            int waterLevel = Math.min(Leftmax[i], Rightmax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
}