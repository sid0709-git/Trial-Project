package javaPackage;

public class EH5 {

	public static void main(String[] args) {
		
		String y = "Automation";

		try {
			int i = Integer.parseInt(y);			//NumberFormatException
		} catch (NumberFormatException e) {

			e.printStackTrace();
		}
		System.out.println("Exception Handled");
	}

}
