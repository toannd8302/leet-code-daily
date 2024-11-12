/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	You can return the answer in any order.
	
 * */
package Day5_2024_11_12_valid_parentlesses;

import java.util.Stack;

public class Solution {

	public boolean isValid(String s) {
		boolean flag = false;
		Stack<Character> stack = new Stack<>();

		for (Character character : s.toCharArray()) {
			switch (character) {
			case '(':
				stack.push(')');
				break;
			case '[':
				stack.push(']');
				break;
			case '{':
				stack.push('}');
				break;
			default:
				if (stack.isEmpty()) {
					return flag;
				}
				char temp = stack.pop();
				if (character != temp)
					return flag;
			}
		}
		if (!stack.isEmpty()) {
			return flag;
		} else {
			flag = true;
		}
		return flag;
	}
}