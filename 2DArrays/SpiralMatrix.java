import java.util.*;
class SpiralMatrix {
    static void spiralMatrix(int matrix[][]){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        while(startrow <= endrow && startcol <= endcol){   //startrow < matrix[0].length && startcol < matrix.length  ->this condition is wrong because startrow & startcol is comparing with matrix fixed size
            // top
            for(int i=startcol; i<=endcol; i++){
                System.out.print(matrix[startrow][i] + " ");
            }
            // System.out.println();
            // right
            for(int i=startrow+1; i<=endrow; i++){
                System.out.print(matrix[i][endcol] + " ");
            }
            // System.out.println();
            // bottom
            for(int i=endcol-1; i>=startcol; i--){
                if(startrow == endrow){
                    break;
                }
                else{
                System.out.print(matrix[endrow][i] + " ");
                }
            }
            // System.out.println();
            // left
            for(int i=endrow-1; i>=startrow+1; i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");

            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        
    }



    public static void main(String[] args) {
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
        int matrix[][] = {{2,5,8},
                          {4,0,-1}};
        spiralMatrix(matrix);
        
    }
}
