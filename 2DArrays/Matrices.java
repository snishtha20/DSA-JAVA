import java.util.*;
class Matrices {
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n= matrix.length; //row=3
        int m=matrix[0].length; //column=3
        Scanner u = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = u.nextInt();
                
            }
            
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
