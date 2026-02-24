// Logic :
// “All sorting algorithms rearrange elements by changing their positions while preserving the original values and their frequencies.”
// Sorting = rearranging positions, never copying values blindly


// Selection Sort: pick the smallest(from unsorted), put it at the beginning

class SelectionSort{
    static int[] Selection_Sort(int arr[]){
       
        for(int i=0; i<=arr.length-2; i++){
            int min = i;
            for(int j= i+1; j<=arr.length-1; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        int a[] = Selection_Sort(arr);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
