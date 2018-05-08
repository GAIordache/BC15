package ex1;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("Hello");

			doCevaCuExceptii();
			System.out.println("Hola");
		} catch (CheckException e) {
			System.out.println("Bubaaaa:" + e.getMessage());
			// e.printStackTrace();
		} catch (UncheckedExc e) {
			System.out.println("NASPAAAA:" + e.getMessage());
			// e.printStackTrace();
		}
	}

	static void doCevaCuExceptii() throws CheckException, UncheckedExc {
		int x = 1;
		System.out.println("1:" + x);
		x = x + 1;
		System.out.println("2:" + x);
		double rnd = Math.random();
		if (rnd < 0.3)
			throw new UncheckedExc("FIFI");
		else if (rnd < 0.6)
			throw new CheckException("PUFI");

		x = x + 2;
		System.out.println("3:" + x);

	}

}
