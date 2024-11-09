/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	You can return the answer in any order.
	
 * */
package Day3_2024_11_09_roman_number;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	/*
	 * I 1 V 5 X 10 L 50 C 100 D 500 M 1000
	 */

	public int romanToInt(String s) {
		Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
		int result = 0;
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		try {
			
			for (int i = s.length() - 2; i >= 0; i--) {
				result = romanMap.get(s.charAt(s.length() - 1));
				if (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
					result -= romanMap.get(s.charAt(i));
				} else {
					result += romanMap.get(s.charAt(i));
				}
			}

		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();

		}
		return result;

	}
}
