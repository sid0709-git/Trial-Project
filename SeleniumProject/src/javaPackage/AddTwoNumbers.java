package javaPackage;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int p,q,sum,subtraction,multiplication;                                
		float Avg;
		
		Scanner myobj= new Scanner (System.in);           //The Scanner class is used to get user input
		
		System.out.println("type first number");
		p=myobj.nextInt();
		
		System.out.println("type second number");
		q=myobj.nextInt();
		
		multiplication=p*q;                           //multiplication
		sum=p+q;                                     // calculation of sum
		subtraction = p-q;                           // subtraction of two numbers
		Avg= (float)((p+q)/2);                      // calculation of average
		
		System.out.println("Multiplication:-" + multiplication);
		System.out.println("Sum:-" + sum);
		System.out.println("Subtraction:-"+subtraction);
		System.out.println("Avg:-" + Avg);
		

	}

}
