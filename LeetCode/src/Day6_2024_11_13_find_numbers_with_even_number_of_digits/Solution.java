/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	You can return the answer in any order.
	
 * */
package Day6_2024_11_13_find_numbers_with_even_number_of_digits;

 public class Solution {

	public int findNumbers(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {

			if (countNumbers(nums[i]) % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public int countNumbers(int n) {
		int count = 0;
		while (n != 0) {
			n /= 10;
			count++;
		}
		return count;
	}
}