class Main {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int sum = nums[i] + nums[j];
                if(target == sum){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String args[]){
        int nums[] = {1,2,3};
        int target = 3;
        Main obj = new Main();
        int result[] = obj.twoSum(nums,target);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]);
        }
    }
}