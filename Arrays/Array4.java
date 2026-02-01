// Binary Search
class Array4 {
    static int BinarySearch(int nums[], int key){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] == key){
                return mid;
            }
            else if(nums[mid] < key){ //right
                start = mid +1;
            }
            else{    //left
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10,12,14};
        int key = 10;
        
        System.out.println("Index of key found at: " + BinarySearch(nums,key));
    }
}
