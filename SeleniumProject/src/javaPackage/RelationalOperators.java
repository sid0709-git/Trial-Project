package javaPackage;

public class RelationalOperators {

	public static void main(String[] args) {
		int a = 25;
		int b = 25;

		if (a != b) {
			System.out.println("a and b are not equals");
		} else {
			System.out.println("a and b are equals");

		}
		
		// lets do string comparison.
		String p = "SIDDHARAM";
		String q = "siddharam";

		// way-1- we use == for number comparison and it is case sensitive.

		if (p == q) {
			System.out.println("p and q are equal");
		} else {
			System.out.println("p and q are not equal");
		}

		// way-2- we used here .euqals() and it is case sensitive.
		
		if (p.equals(q)) {
			System.out.println("p and q are equal");
		} else {
			System.out.println("p and q are not equal");
		}

		// way-3- we used here .euqalsIgnoreCase() and it is 'not-case sensitive'.
		
		if (p.equalsIgnoreCase(q)) {
			System.out.println("p and q are equals");
		} else {
			System.out.println("p and q are not equal");
		}

	}

}

/*
 * difference between ==, equals(), equalsIgnoreCase() == is used for number
 * comparison. equals() is used for string comparison, and it is case sensitive.
 * equalsIgnoreCase() is used for string comparison, and it is not case
 * sensitive.
 */
