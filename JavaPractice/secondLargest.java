class Solution {
	public int secondLargest(int[] nums) {
		// Your code goes here
		 int n = nums.length;
        int max = Integer.MIN_VALUE; 
        int secondmax = Integer.MIN_VALUE;

		for(int i=0 ; i<n;i++){
           if(nums[i]>max){
               secondmax = max;
               max = nums[i];
           }
          
           else if(nums[i]>secondmax && nums[i]!=max){
               secondmax = nums[i];
           }

        }
		return secondmax;
	}
}
