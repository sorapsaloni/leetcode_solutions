package array_questions;

public class sort_all_subArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4 , 5};
		printAllSubArray(arr);
		
	}
	
	public static void printAllSubArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i; j<arr.length; j++) {
				
				for(int k=i; k<=j; k++  ) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
		}
	}

}
