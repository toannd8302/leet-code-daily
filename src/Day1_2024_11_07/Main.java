package Day1_2024_11_07;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };
		int target = 5;
		Long startTime = System.nanoTime();
		int[] result = new Solution().twoSum_2(nums, target);
		Long endTime = System.nanoTime();
		Long duration = endTime - startTime;
		// System.out.println(result); => Only show reference address
		System.out.println(Arrays.toString(result));
		System.out.println(duration);

	}

}
