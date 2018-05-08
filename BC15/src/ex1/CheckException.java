package ex1;

public class CheckException extends Exception {
	public CheckException() {
		super();
	}
	
	public CheckException(String pMsg) {
		super(pMsg);
		System.out.println(super.getMessage());
	}
}
