package javaPackage;

public class EH3 {

	public static void main(String[] args) {
		
		
		try {
			int c= 5/0;					// ArithmeticException
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException n) {
			n.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException b) {
			b.printStackTrace();
		}
		System.out.println("Exception handeled");
	}

}
