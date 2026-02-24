class InsertionSort {
    static int[] Insertion_Sort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        int a[] = Insertion_Sort(arr);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
