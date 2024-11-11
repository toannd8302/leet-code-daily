/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	You can return the answer in any order.
	
 * */
package Day4_2024_11_11_;
import java.util.Arrays;

public class Solution {

	public String longestCommonPrefix(String[] strs) {
		Arrays.sort(strs);
		int index = 0;
		String output = "";
		if (strs.length == 0) {
			return output;
		}
		while (index < strs[0].length()) {
			if (strs[0].charAt(index) == strs[strs.length - 1].charAt(index)) {
				index++;
			} else {
				break;
			}
			if (index == 0) {
				return output;
			} else {
				output = strs[0].substring(0, index);
			}
		}
		return output;
	}
}
