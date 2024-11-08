/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	You can return the answer in any order.
	
 * */
package Day2_2024_11_06_palindrome;

public class Solution {
	// Bài 1: Đếm số các chữ số của 1 dãy số n cho trước (n>0)
	// Cách 1: Dùng 1 vòng lặp đơn thuần
	public int countNumber_1(int n) {
		int nCount = 0;
		while (n != 0) {
			n /= 10;
			nCount++;
		}
		return nCount;
	}

	// Cách 2: Dùng đệ quy
	public int countNumber_2(int n) {
		if (n < 10) {
			return 1;
		}
		return 1 + countNumber_2(n / 10);
	}

	// B2
//	public boolean isPalindrome(int x) {
//		int lastDigit;
//		int numReversed = 0;
//		if (x < 0) {
//			return false;
//		} else if (x < 10 ) {
//			return true;
//		} else if (x % 10 == 0) {
//			return false;
//		}else {
//			while (x > numReversed) {
//				lastDigit = x % 10;
//				numReversed = numReversed * 10 + lastDigit;
//				x /= 10;
//				if (numReversed == x || numReversed == x / 10) {
//					return true;
//				}
//			}
//			return false;
//		}
//
//	}
	// Optimization
	public boolean isPalindrome(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}
		int lastDigit;
		int numReversed = 0;
		while (x > numReversed) {
			lastDigit = x % 10;
			numReversed = numReversed * 10 + lastDigit;
			x /= 10;
		}
		return (x == numReversed ||  numReversed == x / 10);
	}
}
