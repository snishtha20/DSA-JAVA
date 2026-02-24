// Inbuilt Sort:
// We can use inbuilt sorting techniques when we are fighting contests or written test

// import java.util.Arrays;
// class InbuiltSort{
//     public static void main(String args[]){
//         int arr[] = {5,4,1,3,2};
//         // Arrays.sort(arr);
//         // for(int i=0; i<arr.length; i++){
//         //     System.out.print(arr[i] + " ");
//         // }
        
//         // if we want to sort any part of indices 
//         //Arrays.sort(arr,si,ei) but last indesx =ei +1 (last index not included like in python)
//         Arrays.sort(arr, 0, 3); 
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


// If we want to sort in reverse order
import java.util.Arrays;
import java.util.Collections;

class InbuiltSort{
    public static void main(String args[]){
        Integer arr[] = {5,4,1,3,2};
        // Arrays.sort(arr,Collections.reverseOrder());
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        
        // if we want to sort any part of indices 
        //Arrays.sort(arr,si,ei) but last indesx =ei +1 (last index not included like in python)
        Arrays.sort(arr, 0, 3, Collections.reverseOrder()); 
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
