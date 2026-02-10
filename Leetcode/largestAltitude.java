// LeetCode Problem: Find the Highest Altitude
// Difficulty: Easy
// Topic: Arrays

class Solution {
    public int largestAltitude(int[] gain) {
        int a[] = new int[gain.length + 1];
        a[0] = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0; i<gain.length; i++){
            a[i+1] = a[i] + gain[i];
        }
        for(int j=0; j<a.length; j++){
            if(max<a[j]){
                max = a[j];
            }
        }
        return max;
    }
}