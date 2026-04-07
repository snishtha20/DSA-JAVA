// InterviewBit Problem: Repeat and Missing Number Array
// Difficulty: Medium
// Topic: Arrays
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int n = A.length-1;
        long S = (long) n * (n-1)/2;
        long P = (long) n*(n+1)*(2*n+1)/6;
        long S1 =0 ;
        long P1 =0 ;
        for(int num : A){
            S1 += num;
            P1 += (long)num*num;            
        }
        long diff = S-S1;
        long sqDiff = P-P1;
        
        long sum = sqDiff/diff;
        long b = (sum + diff)/2;
        long a = b - diff;
        return new int[]{(int) a, (int) b};
    }
}
