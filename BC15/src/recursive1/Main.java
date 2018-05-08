package recursive1;

/**
 *  
foo_iterative(params){
    header
    while(condition){
        loop_body
    }
    return tail
}

foo_recursive(params){
    header
    return foo_recursion(params, header_vars)
}

foo_recursion(params, header_vars){
    if(!condition){
        return tail
    }

    loop_body
    return foo_recursion(params, modified_header_vars)
}
 *
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("2!=" + FactorialFunctionIterativeMode.calculate(2));
		System.out.println("3!=" + FactorialFunctionIterativeMode.calculate(3));
		System.out.println("5!=" + FactorialFunctionIterativeMode.calculate(5));

		System.out.println("2!=" + FactorialFunctionRecursiveMode.calculate(2));
		System.out.println("3!=" + FactorialFunctionRecursiveMode.calculate(3));
		System.out.println("5!=" + FactorialFunctionRecursiveMode.calculate(5));
		
		int[] valori = { 1,2,3,4,5,6};
		System.out.println("Sum iterativ:" + SumFunctionIterativeMode.sum(valori));
		System.out.println("Sum recursiv:" + SumFunctionRecursiveMode.sum(valori));
		// TODO - varianta recursiva la produs de numere

}

}
