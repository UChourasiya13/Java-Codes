// Given an integer num, return the number of digits in num that divide num.

// An integer val divides nums if nums % val == 0

// Example 1:

// Input: num = 121 
// Output: 2
// Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.


class Solution {
	public int countDigits(int num) {
		// Your code goes here
		int count = 0  ; 
		int store = num ;
		while(num!=0){
			int rem = num % 10 ;
			if(store%rem==0){
				count++ ;
			}
			num/= 10;
			
		}
		return count ;
			
	}
}
