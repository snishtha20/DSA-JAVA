// Bubble Sorting: large elements come to the end of array by swapping with adjacent elemnts

class BubbleSort {
    static int[] Bubble_Sort(int arr[]){
        for(int i=0; i<=arr.length-2; i++){
            for(int j=0; j<=arr.length-2-i; j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[]= {5,4,1,3,2};
        int a[] = Bubble_Sort(arr);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }
    }
}
