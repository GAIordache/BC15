package recursive1;

public class FactorialFunctionRecursiveMode {
	public static long calculate(int pInt) {
		if(pInt <= 1) {
			return 1;
		}
		return pInt * calculate(pInt - 1);
	}
}
