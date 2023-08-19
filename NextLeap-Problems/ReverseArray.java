class Solution {
    public int[] reverseArray(int[] nums) {
        // Your code goes here
        int size = nums.length ;
        int i = 0;
        int j = size-1;
        while(i<j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        return nums;
    }
}
