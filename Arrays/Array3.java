//Largest & Smallest in Array
class Array3 {
    static int Largest(int nums[]){
        // int LargestNum = Integer.MIN_VALUE; //-infinity
        // int SmallestNum = Integer.MAX_VALUE; //+infinity
        int LargestNum = nums[0]; 
        int SmallestNum = nums[0];
        for(int i=0; i<nums.length; i++){
            if(LargestNum < nums[i]){
                LargestNum = nums[i];
            }
            if(SmallestNum > nums[i]){
                SmallestNum = nums[i];
            }
        }
        System.out.println("Smallest num in array: " + SmallestNum);
        return LargestNum;
    }
    public static void main(String args[]){
        int nums[]= {1,2,3,7,6,9,4,3,8};

        System.out.println("Largest num in array: " + Largest(nums));
       
    }    
}
