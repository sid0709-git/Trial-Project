package javaPackage;

public class EH1 {

	public static void main(String[] args) {
		try {
			int a = 10 / 0; 				// ArithmeticException
		} catch (ArithmeticException a) {
			a.printStackTrace(); 			// gives complete exception info
			System.out.println(a); 			// only exception info
		} catch (NullPointerException n) {
			System.out.println(n);
		} catch (ArrayIndexOutOfBoundsException b) {
			System.out.println(b);
			
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Exception handeled");
		
		try {
		int b = 20/0;					// ArithmeticException
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally will execute always");
		}
		
		
	}
}
