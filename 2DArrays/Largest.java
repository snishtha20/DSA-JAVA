class Largest {
    static int Maximum(int matrix[][]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(max<matrix[i][j]){
                    max = matrix[i][j];
                }
               
            }
        }
        return max;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        int a = Maximum(matrix);
        System.out.println(a);
    }    
}
