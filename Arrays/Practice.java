// // Practice questions

// Contains Duplicate
// class Practice{
//     static boolean Practice1(int nums[]){        
//         for(int i=0; i<nums.length; i++){           
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i] == nums[j]){
//                     return true;
//                 }
//             }                       
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         int nums[] = {1,1,1,3,3,4,3,2,4,2};
//         boolean a = Practice1(nums);
//         System.out.println(a);
//     }
// }

// Best time to Buy & Sell Stocks
// class Practice{
//     static int Practice3(int prices[]){
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         int profit = 0;
//         for(int i=0; i<prices.length; i++){
//             int sellPrice = prices[i];
//             if(buyPrice < sellPrice){
//                 profit = sellPrice - buyPrice; 
//             }
//             else{
//                 buyPrice = sellPrice;
//             }
//             if(maxProfit<profit){
//                 maxProfit = profit;
//             }
//         }
//         return maxProfit;
//     }
//     public static void main(String args[]){
//         int prices[] = {7,6,4,3,1};
        
//         int result = Practice3(prices);
//         System.out.println(result);
//     }
// }

// Trapping Rain Water
// class Practice{
//     static int Practice4(int height[]){
//         int n = height.length;
//         int width =1; // Given width = 1         
//         // Leftmax boundary-array
//         int Leftmax[] = new int[n];
//         Leftmax[0] = height[0];
//         for(int i=1; i<n; i++){
//             Leftmax[i] = Math.max(height[i], Leftmax[i-1]);
//         }
//         int Rightmax[] = new int[n];
//         Rightmax[n-1] = height[n-1];
//         for(int i=n-2; i>=0; i--){
//             Rightmax[i] = Math.max(height[i], Rightmax[i+1]);
//         }
//         int trappedWater =0;
//         for(int i=0; i<n; i++){
//             int waterLevel = Math.min(Leftmax[i], Rightmax[i]) * width;
//             trappedWater += (waterLevel - height[i]) ;           
//         }
//         return trappedWater;        
//     }
//     public static void main(String args[]){
//         int height[] = {4,2,0,6,3,2,5};
//         int sum = Practice4(height);
//         System.out.println(sum);
//     }
// }

// 3Sum
// class Practice{
//     int[] Practice5(int nums[]){
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 for(int k=j+1; k<nums.length; k++){
//                     if(nums[i]+nums[j]+nums[k]==0){
//                         return new int[]{nums[i],nums[j],nums[k]};
//                     }
//                 }
//             }
//         }
//         return new int[]{};
//     }
//     public static void main(String args[]){
//         int nums[] = {0};
//         Practice obj = new Practice();
//         int a[] = obj.Practice5(nums);
//         for(int i=0; i<a.length; i++){
//             System.out.println("[" + a[i] + " ]");
//         }
//     }
// }


// kids with Candies
// class Practice{
//     public static void main(String args[]){
//         int candies[] = {2,4,8,1,3};
//         int max = Integer.MIN_VALUE;
//         for(int i =0; i<candies.length; i++){
//             if(max <= candies[i]){
//                 max = candies[i];
//             }
//         }
//         System.out.println(max);
//     }
// }


class Practice{
    public static void main(String args[]){
        int nums[] = {2,5,1,3,4,7};
        int n =3;
        int x = nums[0];
        System.out.println("x:" + x);
        int y = nums[n];
        System.out.println("y:" +y);
        int a[] = new int[nums.length];
        for(int i =0; i<a.length; i++){

            if(i==0 || i%2 == 0){
                a[i] = x;
                x = i == n-1 ? nums[i] : nums[i+1];
                System.out.println("x:" + x);
                
            }
            else{
                a[i] = y;
                y = i == nums.length-1 ? nums[nums.length-1] : nums[n+1];
                System.out.println("y:" +y);
            }
           
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}