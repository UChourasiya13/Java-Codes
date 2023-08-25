 class Solution {
	public int binarySearch(int[] arr,int target){
		int n = arr.length;
		int low = 0;
		int high = n-1;
		while(low<=high){
			int mid = low + (high-low)/2;
			if(arr[mid]==target)return mid;
			else if(arr[mid]<target){
				low = mid+1;
			}
			else{
				high = mid-1;
			}
		}
		return -1;
	}
	public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		// Your code goes here
		int suma=0;
		int sumb=0;
		int sizea= aliceSizes.length;
		int sizeb = bobSizes.length;
		int []answer =new int[2];
		//Alice Array sum
		for(int i=0;i<sizea;i++){
			 suma= suma+aliceSizes[i];
		}
		//Bob Array sum
		for(int i=0;i<sizeb;i++){
			 sumb= sumb+bobSizes[i];
		}
		int Totalsum =suma+sumb;
		int RequiredSum = Totalsum/2;
		int ansA=0;
		int ansB = 0;
		Arrays.sort(bobSizes);
		for(int i =0 ; i <sizea;i++){
			int currentsum = suma - aliceSizes[i];
			int value = RequiredSum - currentsum ;
			//now apply binary search 
			int secondval = binarySearch(bobSizes , value);
			if(secondval!=-1 ){
				ansA = i;
				ansB = secondval;
				break;
			}
		}
			answer[0] = aliceSizes[ansA];
			answer[1] = bobSizes[ansB];
		return answer;
	}
}
