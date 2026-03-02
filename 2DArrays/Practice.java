// Print the number of 7’s that are in the 2d array.
// class Practice {
//     static void Practice1(int matrix[][]){
//         int count =0;
//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                 if(matrix[i][j] == 7){
//                     count++;
//                 }
//             }
//         }
//         System.out.print(count);
//     }
//     public static void main(String args[]){
//         int matrix[][] = {{4,7,8},{8,8,7}};
//         Practice1(matrix);
//     }
// }

// Print out the sum of the numbers in the second row of the “nums" array.
// class Practice {
//     static void Practice2(int matrix[][]){
//         int sum =0;
//         for(int j=0; j<matrix[0].length; j++){
//             sum += matrix[1][j];
//         }
//         System.out.print(sum);
//     }
//     public static void main(String args[]){
//         int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};
//         Practice2(matrix);
//     }
// }

// Write a program to Find Transpose of Matrix
// What is Transpose? Transpose of a matrix is the process of swapping the rows to columns.
class Practice {
    static int[][] Practice3(int matrix[][]){
        int transpose[][] = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                transpose[j][i] = matrix[i][j];                
            }
        }
        return transpose;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6}};
        int a[][] = Practice3(matrix);
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.print(a[i][j] + " ");  
            }
            System.out.println();
        }
    }
}

