package Day5_2024_11_12_valid_parentlesses;

public class Main_ValidParentheses {

	public static void main(String[] args) {

		Solution solution = new Solution();
		String s = "{}[]";
		Boolean result = solution.isValid(s);
		System.out.println(result);
	}
}
