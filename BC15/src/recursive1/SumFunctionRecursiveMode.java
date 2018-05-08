package recursive1;

public class SumFunctionRecursiveMode {
	public static int sum(int[] pArgs) {
		return sumRecursive(pArgs,0);
	}
	
	public static int sumRecursive(int[] pArgs,int pCurrIdx) {
		if(pCurrIdx >= pArgs.length) {
			return 0;
		}
		return  pArgs[pCurrIdx] + sumRecursive(pArgs, pCurrIdx + 1);
	}
}
