// Given a positive integer n, find the pivot integer x such that:

// The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
// Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.

// Example 1:

// Input: n = 8 
// Output: 6
// Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.

class Solution {
	public int pivotInteger(int n) {
		// Your code goes here
        int rightHandSide = (n*n + n)/2;
		int x = (int)Math.sqrt(rightHandSide);
		
		if(x * x == rightHandSide)
		{
		    // rightHandSide is a perfect square 
		    return x;
		}
		else 
		{
		    // If no such integer exists, return -1 
		    return -1; 
		}

	}
}
