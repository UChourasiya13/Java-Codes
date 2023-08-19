class Solution {
	public List<Integer> removeDuplicates(List<Integer> nums) {
		
		List<Integer> answer = new ArrayList<>();
        int i = 0;
        int j = 0;
		
		int size = nums.size();
		
		while(i<size)
		{
		    // skipping the duplicate values 
		    while(j<size && nums.get(i)== nums.get(j))
		    {
		        j++;
		    }
		    
		    // current ith element it will represent unique element 
		    answer.add(nums.get(i));
		    
		    i = j; // j is representing the next element 
		}
		
		return answer;
	}
}

