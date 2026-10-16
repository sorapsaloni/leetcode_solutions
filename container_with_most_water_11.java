package array_questions;

public class container_with_most_water_11 {
	
	public static void main(String[] args) {
		
	}
	
	public static int maxArea(int[] arr) {
		
		int i = 0;
		int j = arr.length-1;
		int max = 0;
		
		while(i<j) {
			
			int min = Math.min(arr[i], arr[j]);
			int width = j-i;
			int area = min * width; 
			
			max = Math.max(max, area);	
			
			if(arr[i] < arr[j]) 
				i++;
			else 
				j--;
			
		}
		
		return max; 		
		
	}

}
