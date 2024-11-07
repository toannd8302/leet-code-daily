package Day2_2024_11_06_palindrome;

public class Main_CountNumber {

	public static void main(String[] args) {
		// Note: countNumber_1: Dùng vòng lặp đơn thuần
		// countNumber_2: Dùng đệ quy

		int n = 202045; // => 6
		// int n = 2020; //=> 4
		// int n = 2031234560; // => 10
		Solution solution = new Solution();
		// int nCount = solution.countNumber_1(n);
		int nCount = solution.countNumber_2(n);
		System.out.println(nCount);
	}
}
