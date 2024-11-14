/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	You can return the answer in any order.
	
 * */
package Day7_2024_11_14_squares_of_a_sorted_array;

import java.util.Arrays;

public class Solution {
	 public int[] sortedSquares(int[] nums) {
	        for (int i = 0; i < nums.length; i++) {
	            nums[i] = nums[i] * nums[i];
	        }
	        Arrays.sort(nums);
	        return nums;
	    }
}