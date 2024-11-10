package Day3_2024_11_09_roman_number;

public class Main_RomanNumber {

	public static void main(String[] args) {
		// Note: countNumber_1: Dùng vòng lặp đơn thuần
		// countNumber_2: Dùng đệ quy

		// String s = "VII"; // => 7
		// String s = "LVIII"; // => 58
		// String s = "MCMXCIV"; // => 1994
		String s = "MCMXCIX"; // => 1999
		
		Solution solution = new Solution();
		// int nCount = solution.countNumber_1(n);
//		int result = solution.romanToInt(s);
		int result = solution.romanToInt_2(s);
		System.out.println(result);
	}
}
