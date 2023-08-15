

class Solution {
	public int singleNumber(int[] nums) {
	    // 3 ways - 
		// 1. Frequency Array (To save space use Hashmap or map) (Time Complexity - N, space Complexity - N)
		// 2. Sorting and Two pointer (Time Complexity - N log N, Space Complexity - 1)
		// 3. XOR (BIT Manipulation - DSA Month 2) (Time Complexity - N, Space Complexity - 1)
		
		Arrays.sort(nums);
		int size = nums.length;
		int answer = -1;
		
		for(int i=0; i<size; i=i+2)
		{
		    if(i+1 >= size) 
		    {
		        answer = nums[i];
		    }
		    else if(nums[i] != nums[i+1]) // comparing the adjacent element 
		    {
		        answer = nums[i];
		        break;
		    }
		}
		
		return answer;
		// Frequency Array (Indexes are used as numbers/elements of array)
		// - We will create a Frequency array of size (max value in array + 1)
		// - We will iterate in original array 
		
		// Sorting and two pointers 
		// - Sorting the array 
		// - Compare adjacent elements (There is only one missing number) 
	}
}

