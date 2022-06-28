package javaPackage;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {

		int n, num = 0, i, j;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of rows of floyd's triangle you want");

		n = in.nextInt();

		System.out.println("See the Floyd's triangle :-");
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();

		}
	}

}
