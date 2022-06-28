package javaPackage;

public class MultiplicationTable {

	public static void main(String[] args)

	{
		for (int i = 2; i <= 20; i++) { 							// outer loop

			for (int j = 1; j <= 10; j++) { 					// inner loop

				System.out.print((i * j) + " ");
			}
			System.out.println();
		}
	}
}
