package javaPackage;

import java.util.Scanner;

public class OddorEvenNumber {

	public static void main(String[] args) {

		int m;
		Scanner input = new Scanner(System.in); // The Scanner class is used to get user input

		System.out.println("Enter an integer to check either it is even or odd");
		m = input.nextInt(); // we used nextInt()method

		if (m % 2 == 0)
			System.out.println("entered number is even");
		else
			System.out.println("entered number is odd");

	}

}
