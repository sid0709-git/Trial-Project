package javaPackage;

public class EH7 {

	public static void main(String[] args) {

		try {
			int i = 10 / 0; 				//ArithmeticException
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally will execute always");
		}
		System.out.println("Exception Handled");
	}

}
