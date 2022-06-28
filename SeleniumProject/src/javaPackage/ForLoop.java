package javaPackage;

public class ForLoop {

	public static void main(String[] args) {

		double math[] = { 2, 4, 6, 7,44,66,36,7.7 };
		double total = 0;
		for (int i = 0; i < math.length; i++) {
			total += math[i];
		
			System.out.println("Total is: " + total); //summing all elements in array

		}

		 //for(int i = 0 ; i<7; i++) { //syntax is- for(initialization; condition check; incr/decr)
		// for(int i = 0; i<21; i = i + 2) // we can print 'be che pade' also..
		// for(int i = 0; i<51; i= i+5) // 5 che pade
		// for (int i = 3; i<31; i= i+3) // 3 che pade
		// for(int i = 0; i<71; i=i+7) // 7 che pade
		// System.out.println("Value of i is:- " + i);
	}
}

/*
 * for loop is used to iterate part of program multiple times. if no.of
 * iteration is fixed, we use for loop. When you know exactly how many times you
 * want to loop through a block of code, use the for loop instead of a while
 * loop:
 */