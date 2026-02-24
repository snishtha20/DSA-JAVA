// Reverse an array
class Array5{
    static void reverse(int nums[]){
        int first = 0;
        int last = nums.length-1;
        while(first<last){
            int a = nums[first];
            nums[first] = nums[last];
            nums[last] = a;
            first ++;
            last --;
        }  
    }
    public static void main(String args[])
    {
        int nums[] = {2,4,6,8,10};
        reverse(nums);
        for (int i = 0; i<nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }
}
