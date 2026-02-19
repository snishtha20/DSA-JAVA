// Print Subarray
// class Array7 {
//     static void Subarray(int nums[]){
//         int ts =0;
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 for(int k=i; k<=j; k++){
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
// class Array7{
//     static void maxSum(int nums[]){
//         int max = Integer.MIN_VALUE;
        
//         for(int i=0; i<nums.length; i++){
            
//             for(int j=i+1; j<nums.length; j++){
//                 int sum=0;
//                 for(int k=i; k<=j; k++){
//                     sum+=nums[k];
//                 }
//                 if(max<sum){
//                     max = sum;
//                 }
//             }
            
//         }
//         System.out.println("Max: " + max);
//     }
//     public static void main(String args[]){
//         int nums[] = {1,-2,6,-1,3};
//         maxSum(nums);
//     }
// }


//Prefix Sum Method

// class Array7{
//     static void Sum(int nums[]){
//         int sum[] = new int[nums.length];
//         int prefix_arr[] = new int[nums.length];
//         prefix_arr[0] = nums[0];
//         for(int i=1; i<nums.length; i++){
//             prefix_arr[i] = prefix_arr[i-1] + nums[i];
//         }      
//         for(int i=0; i<nums.length;i++){
//             for(int j=i+1; j<nums.length;j++){
//                 if(i == 0){
//                     sum[i] = prefix_arr[j];
//                 }
//                 else{
//                     sum[i] = prefix_arr[j] - prefix_arr[i-1];
//                 }
//                 System.out.print(sum[i] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int nums[] = {1,2,3,4,5};
//         Sum(nums);
//     }
// }


// Prefix Sum correct wala
// class Array7{
//     static void maxSum(int nums[]){
//         int a[] = new int[nums.length];
//         int max = Integer.MIN_VALUE;
//         int sum =0;
//         for(int i=0; i<nums.length; i++){
//             sum += nums[i];
//             a[i] = sum; 
//             System.out.print(a[i] + " ");
//         }
//         System.out.println("");
//         int b = 0;

//         for(int j =0; j<a.length; j++){
            
//             for(int k = j+1; k<a.length; k++){
//                 if(j==0){
//                     b = a[k];
//                 }
//                 else{
//                     b = a[k]-a[j-1];
//                 }
                
//             }
//             if(max<b){
//                 max = b;
//             }

//         }
//         System.out.println("MAX: " + max);

       
//     }
//     public static void main(String args[]){
//         int nums[] = {1,-2,6,-1,3};
//         maxSum(nums);
//     }
// }



// Kadane Algorithm :
//  +ve + +ve =+ve
//  +ve + -ve =+ve (+ve>-ve)
//  +ve + -ve =-ve (+ve<-ve) wrong/worst case


// class Array7{
//     static void maxSum(int nums[]){
//         int cs =0 ; //current sum
//         int ms = Integer.MIN_VALUE; // max sum
//         for(int i =0; i<nums.length; i++){
//             if(nums[i]<0 && cs+nums[i]<0){
//                 cs = 0;
//             }
//             else{
//                 cs += nums[i];
//             }
//             if(ms<cs){
//                 ms = cs;
//             }
//             // System.out.println("Current Sum: " + cs);
//             // System.out.println("Maximum Sum: " + ms);
//         }
//         System.out.println("Current Sum: " + cs);
//         System.out.println("Maximum Sum: " + ms);
//     }
//     public static void main(String args[]){
//         int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
//         maxSum(nums);
//     }    
// }

// 2nd logic
// class Array7{
//     static void maxSum(int nums[]){
//         int cs =0 ; //current sum
//         int ms = Integer.MIN_VALUE; // max sum
        
       
//         for(int i =0; i<nums.length; i++){
           
//            cs += nums[i];
//            if(cs<0){
//             cs =0;
//            }
//            ms = Math.max(cs,ms);
//         }
//         System.out.println("Current Sum: " + cs);
//         System.out.println("Maximum Sum: " + ms);
//     }
//     public static void main(String args[]){
//         int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
//         maxSum(nums);
//     }    
// }

// 3rd logic
class Array7{
    static void maxSum(int nums[]){
        int cs =0 ; //current sum
        int ms = Integer.MIN_VALUE; // max sum
        
       
        for(int i =0; i<nums.length; i++){
           
          cs = Math.max(nums[i], cs+nums[i]);
          ms = Math.max(cs,ms);
        }
        System.out.println("Current Sum: " + cs);
        System.out.println("Maximum Sum: " + ms);
    }
    public static void main(String args[]){
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        maxSum(nums);
    }    
}