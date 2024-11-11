package Day4_2024_11_11_;

public class Main_RomanNumber {

	public static void main(String[] args) {

		Solution solution = new Solution();
		// int nCount = solution.countNumber_1(n);
//		int result = solution.romanToInt(s);
		String[] strs = {"flower","flow","flight"};
		String result = solution.longestCommonPrefix(strs);
		System.out.println(result);
	}
}
