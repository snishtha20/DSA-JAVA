class Array1 {
    static void update(int x[]){
       for(int i=0; i<x.length; i++){
        x[i] = x[i] + 1;
       }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3};
        update(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
