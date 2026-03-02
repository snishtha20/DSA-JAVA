class Smallest {
    static int Minimum(int matrix[][]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(min>matrix[i][j]){
                    min = matrix[i][j];
                }
               
            }
        }
        return min;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        int a = Minimum(matrix);
        System.out.println(a);
    }    
}
