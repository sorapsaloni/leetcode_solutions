package array_questions;

import java.util.Arrays;

public class sort_Colours_75 {
	
	public static void main(String[] args) {
		int[] arr = {2,0,1};
		sortColors(arr);
	}
	
	public static void sortColors(int[] nums) {

        int m = 0; 
        int l = 0; 
        int r = nums.length - 1; 

        while(m <= r) {
            if(nums[m] == 2) {
                int temp = nums[m];
                nums[m] = nums[r];
                nums[r] = temp;
                r--;
            }
            else if(nums[m] == 0){
                int  temp = nums[m];
                nums[m] = nums[l];
                nums[l] = temp;
                l++;
                m++;
            }
            else {
                m++;
            }
        }
        System.out.println(nums);
        
    }

}

