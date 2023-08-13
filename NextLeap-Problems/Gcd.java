// Find Greatest Common Divisor of Array
//   Given an integer array nums, return**** the greatest common divisor of the smallest number and largest number in nums.
// The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

class Solution {
    public int getGcd(int a ,int b){
        int greatestComman = 1 ;
        while(b!=0){
            int remainder = a%b;
            a = b ;
            b = remainder ;
            greatestComman = a ;
        }
        return greatestComman  ;
    }
	public int findGCD(int[] nums) {
		// Your code goes here
       Arrays.sort(nums) ;
        int smallest = nums[0];
        int largest = nums[nums.length - 1] ;
        int gcd = getGcd(smallest , largest) ;
        return gcd ;
	}
}
