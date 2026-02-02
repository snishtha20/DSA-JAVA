// LeetCode Problem: Find Numbers with Even Number of Digits
// Difficulty: Easy
// Topic: Arrays

class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i =0; i<nums.length; i++){
            int a = nums[i];
            int digit =0;
            if(a==0){
                digit =1;
            }
            else{
                while(a>0){
                    digit++;
                    a = a/10;
                }
                if(digit%2 == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
