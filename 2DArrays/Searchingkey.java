class Searchingkey {
    static boolean Search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                   System.out.print("Found at " + "(" + i + "," + j + ")"); 
                   return true;
                }
            }
        }
        System.out.print("Not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int key = 9;
        Search(matrix, key);
    }
}
