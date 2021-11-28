package collections;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] nums = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		int temp;
		
		for(int i=0; i<nums.length/2; i++) {
			
			temp = nums[i];
			nums[i] = nums[nums.length-1-i];
			nums[nums.length-1-i] = temp;	
			
			//round 1
			//temp = 10
			//90, 20, 30, 40, 50, 60, 70, 80, 90
			//90, 20, 30, 40, 50, 60, 70, 80, 10
			
			//round 2
			//temp = 20
			//90, 80, 30, 40, 50, 60, 70, 80, 10
			//90, 80, 30, 40, 50, 60, 70, 20, 10
			
		}
		
		System.out.println(Arrays.toString(nums));

	}

}
