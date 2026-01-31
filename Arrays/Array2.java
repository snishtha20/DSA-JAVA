//Linear Search
class Array2 {
    static int LinearSearch(int nums[], int key ){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10,12,14};
        int key = 10;
        int idx  = LinearSearch(nums, key);
        if(idx == -1){
            System.out.println("No found");
        }
        else{
            System.out.println("Key at index: " + idx);
        }
    }
}
