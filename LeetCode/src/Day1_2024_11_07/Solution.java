/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	You can return the answer in any order.
	
 * */
package Day1_2024_11_07;


import java.util.HashMap;

public class Solution {
	// Solution 1 => 2 for => O(n2)

	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return nums;
	}

	// Solution 2
	// => Dùng HasMap => O(n)
	// => Dủng phần bù
	public int[] twoSum_2(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
