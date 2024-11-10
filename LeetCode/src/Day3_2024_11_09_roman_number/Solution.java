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
			result = romanMap.get(s.charAt(s.length() - 1));
			for (int i = s.length() - 2; i >= 0; i--) {

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

	public int romanToInt_2(String s) {

		if (validateRomanNumber(s)) {
			int resultValue = 0;
			int preValue = 0;

			for (int i = s.length() - 1; i >= 0; i--) {
				char curChar = s.charAt(i);
				int curValue = getValue(curChar);
				if (curValue < preValue) {
					resultValue -= curValue;
				} else {
					resultValue += curValue;
				}
				preValue = curValue;
			}

			return resultValue;
		} else {
			System.out.println('\n' + "Wrong Roman Numericals Format!!");
			System.exit(0);
		}
		return 0;
	}

	private boolean validateRomanNumber(String s) {
		int count_I = 0;
		int count_V = 0;
		int count_X = 0;
		int count_L = 0;
		int count_C = 0;
		int count_D = 0;
		int count_M = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'V') {
				count_V++;
			} else if (s.charAt(i) == 'L') {
				count_L++;
			} else if (s.charAt(i) == 'D') {
				count_D++;
			} else if (s.charAt(i) == 'I') {
				count_I++;
			} else if (s.charAt(i) == 'X') {
				count_X++;
			} else if (s.charAt(i) == 'C') {
				count_C++;
			} else if (s.charAt(i) == 'M') {
				count_M++;
			}
		}
		if ((count_V > 1 || count_L > 1 || count_D > 1) || (count_I > 3 || count_X > 3 || count_C > 3 || count_M > 3)) {
			return false;
		} else
			return true;
	}

	private int getValue(char curChar) {
		switch (curChar) {
		case 'I':
			return 1;

		case 'V':
			return 5;

		case 'X':
			return 10;

		case 'L':
			return 50;

		case 'C':
			return 100;

		case 'D':
			return 500;

		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
}
