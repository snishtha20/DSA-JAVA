// Search in a sorted matrix(row-wise & col-wise sorted)

class StaircaseSearch{
    static void staircaseSearch(int matrix[][], int key){
        int row =0; 
        int col = matrix.length-1; 
        // Taking top right corner as main point  
        while(row<matrix.length && col>=0){
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[0].length; j++){
                    if(key == matrix[i][j]){
                        System.out.print(i + "," + j);
                    }
                    else if(key>matrix[0][matrix.length-1]){
                        row++;
                    }
                    else if(key<matrix[0][matrix.length-1]){
                        col--;
                    }
                    // Below conditions follow when bottom left corner as main point
                    // else if(key>matrix[matrix[0].length][0]){
                        
                    // }
                    // else if(key<matrix[matrix[0].length][0]){
                        
                    // }
                }
            }
        }
        
    }
    public static void main(String args[]){
        // int matrix[][] = {{1,2,3,4},
        //                   {5,6,7,8},
        //                   {9,10,11,12},
        //                   {13,14,15,16}};

        // int matrix[][] = {{1,2,3},
        //                   {4,5,6},
        //                   {7,8,9}};

        // int matrix[][] = {{1,2,3,4},
        //                   {5,6,7,8},
        //                   {9,10,11,12}};

        // int matrix[][] = {{2,5,8},
        //                   {4,0,-1}};

        int key = 2;
        staircaseSearch(matrix, key);
        // int ans = staircaseSearch(matrix, key);
        // System.out.print(ans);
    }
}