package array_questions;

public class MaxSumSubArraySize {
	
	public static void main(String[] args) {
		int[] arr = {2, 1, 5, 1, 3, 2};
		int k = 3;
		System.out.println(maxSum(arr, k));
	}
	
	public static int maxSum(int[] arr, int k) {
		
		int left = 0;
		int max = 0;
		int currentSum = 0;
		
		for(int right = 0; right < arr.length; right++) {
			currentSum += arr[right];
			if(right - left + 1 == k ) {
				max = Math.max(max, currentSum);
				currentSum -= arr[left];
				left++;
			}
			
		}
		return max; 
	}

}
