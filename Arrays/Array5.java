//Print Subarray
// class Array5 {
//     static void Subarray(int nums[]){
//         int ts =0;
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 for(int k = i; k<=j; k++){
//                     System.out.print(nums[k]+ " ");
                    
//                 }
//                 System.out.println();
//                 ts++;
//             }
            
//         }
//         System.out.println("Total Subarray: "+ ts);
//     }
//     public static void main(String args[]){
//         int nums[] = {2,4,6,8,10};
//         Subarray(nums);
//     }
// }

//Maximum Sum of subarrays
//(Brute Force)
// class Array5{
//     static void Sum(int nums[]){
//         int max = Integer.MIN_VALUE; //-infinity
//         int sum = 0;
//         for(int i=0; i<nums.length; i++){
//             for(int j=i; j<nums.length; j++){
//                 for(int k=i; k<=j; k++){
//                     System.out.print(nums[k] + " ");
//                     sum += nums[k];
//                 }
//                 System.out.println();
//                 System.out.println("Sum: " +sum);
//                 if(max < sum){
//                     max = sum;
//                 }
//                 sum = 0;
//                 System.out.println();
//             }
//             System.out.println();

//         }
//         System.out.println("Maximum:" + max);

//     }
//     public static void main(String args[]){
//         int nums[] = {5,4,-1,7,8};
//         Sum(nums);
//     }
// }


//Prefix Sum Method
class Array5{
    static void Sum(int nums[]){
        int sum[] = new int[nums.length];
        int prefix_arr[] = new int[nums.length];
        prefix_arr[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            prefix_arr[i] = prefix_arr[i-1] + nums[i];
        }
        
        for(int i=0; i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(i == 0){
                    sum[i] = prefix_arr[j];
                }
                else{
                    sum[i] = prefix_arr[j] - prefix_arr[i-1];
                }
                System.out.print(sum[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5};
        Sum(nums);
    }
}




