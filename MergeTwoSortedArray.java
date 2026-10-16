package array_questions;

import java.util.Arrays;

public class MergeTwoSortedArray {
	
	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30};
		int[] arr2 = {15};
		
		int[] result = merged_sorted_array(arr1, arr2);
 		
		System.out.println(Arrays.toString(result));
		
	}
	
	public static int[] merged_sorted_array(int[] arr1, int[] arr2) {
	
		
		int[] merged = new int[arr1.length + arr2.length] ;
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<arr1.length && j<arr2.length) {
			
			if(arr1[i] < arr2[j]) {
				merged[k++] = arr1[i++];
			}
			else {
				merged[k++] = arr2[j++];
			}
		}
		
		//stored the remaining elements 
		
		while(i < arr1.length) {
			merged[k++] = arr1[i++];
		}
		
		while(j<arr2.length) {
			merged[k++] = arr2[j++];
		}
		
		return merged; 
	
	}
	

}
