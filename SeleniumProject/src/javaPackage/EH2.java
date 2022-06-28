package javaPackage;

public class EH2 {

	public static void main(String[] args) {

		try {
			int c = 3 / 0; // ArithmeticException
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("Exception Handeled");
	}

}
