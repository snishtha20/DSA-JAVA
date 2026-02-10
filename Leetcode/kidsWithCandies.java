// LeetCode Problem: Kids with the greatest number of candies
// Difficulty: Easy
// Topic: Arrays


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int max = Integer.MIN_VALUE;
        for(int i =0; i<candies.length; i++){
            if(max <= candies[i]){
                max = candies[i];
            }
        }
        for(int i =0; i<candies.length; i++){
            
            int sum = candies[i] + extraCandies;
            
            if(sum >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
            
        }
        
        return result;
        
    }
}