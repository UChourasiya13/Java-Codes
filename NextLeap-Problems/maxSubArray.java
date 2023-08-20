class Solution {
    public int maxSubArray(int[] nums) {
        //by applying kaden's algo we are finding maximum sum array
        int size=nums.length;
        int max= Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        if(max<0){
            return 0;
        }
        return max;
    }
}
