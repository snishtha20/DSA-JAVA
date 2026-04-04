// GeeksForGeeks Problem: Reverse an Array
// Difficulty: Easy
// Topic: Arrays
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int a = arr[first];
            arr[first] = arr[last];
            arr[last] = a;
            first++;
            last--;
        }
    }
}
