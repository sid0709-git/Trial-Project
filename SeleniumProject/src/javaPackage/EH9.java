package javaPackage;

public class EH9 {

	public static void checkEligibility(int age) {
		try {
		if(age < 18) {
			throw new ArithmeticException ("not applicable for voting");
		}else {
			System.out.println("Applicable");
		}

	}catch(Exception e) {
		e.printStackTrace();
}
	}
	public static void main(String[] args) throws InterruptedException,ArrayIndexOutOfBoundsException,Exception {
		Thread.sleep(3000);
		checkEligibility(15);
		checkEligibility(19);
		
		
	}
}
