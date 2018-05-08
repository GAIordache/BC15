package recursive1;

public class SumFunctionIterativeMode {
	public static int sum(int[] pArgs) {
		int result = 0;
		for(int v : pArgs) {
			result += v;
		}
		return result;
	}
}
