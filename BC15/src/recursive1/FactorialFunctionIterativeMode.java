package recursive1;

public class FactorialFunctionIterativeMode {
	public static long calculate(int pInt) {
		long result = 1;
		if (pInt <= 1) {
			return result;
		}
		for (int i = pInt; i >= 2; i--) {
			result *= i;
		}
		return result;
	}
}
