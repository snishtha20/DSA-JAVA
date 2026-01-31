class Array4 {
    static int Pair(int nums[]){
        int tp = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                System.out.print( "(" + nums[i]+ "," + nums[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs:" + tp);
        return 0;
    }
    public static void main(String args[]){
        int nums[]= {2,4,6,8,10};

        Pair(nums);
    }    
}
