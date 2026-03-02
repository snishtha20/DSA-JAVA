class DiagonalSum {
    static int diagonalSum(int matrix[][]){
        int sum =0;
        // Brute force: O(n^2)
        // Primary DIagonal
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix.length; j++){
        //         if(i==j){
        //             sum += matrix[i][j];
        //         }                
        //     }
        // }
        // Secondary Diagonal
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix.length; j++){
        //         if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // Optimized: O(n)
        for(int i=0; i<matrix.length; i++){
            sum += matrix[i][i]; //Primary Diagonal
            sum += matrix[i][matrix.length-i-1]; //Secondary Diagonal
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        int sum = diagonalSum(matrix);
        System.out.print(sum);
    }
}
