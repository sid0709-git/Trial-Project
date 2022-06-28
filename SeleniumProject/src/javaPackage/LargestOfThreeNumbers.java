package javaPackage;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {

		int x, y, z, largest, temp;

		System.out.println("Enter three integers ");

		Scanner myObj = new Scanner(System.in);

		x = myObj.nextInt();
		y = myObj.nextInt();
		z = myObj.nextInt();

		// we have used two ternary operators to compare three numbers
		// temp = x > y ? x : y;
		// largest = z > temp ? z : temp;

		// using if- else statement also we can compare 3 numbers....

		if (x > y && x > z)
			System.out.println("First number is largest.");
		else if (y > x && y > z)
			System.out.println("Second number is largest.");
		else if (z > x && z > y)
			System.out.println("Third number is largest.");
		

		//System.out.println("Largest number is :-" + largest);

	}

}
