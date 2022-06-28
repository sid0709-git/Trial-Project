package javaPackage;

public class Variable3 {
	public static void main(String[] args) {
		int a[]  = {1,2,3,4,5,6,7,8,9,10,11,12};                               //prepared int ARRAY
		String b[]= {"Sallu","mallu","kallu","ballu"};                         //prepared String ARRAY
		
		System.out.println(a[2]);                   //output will be -3
		System.out.println(a[5]);                   //output will be -6
		System.out.println(a[4]);                   //output will be -5
		System.out.println(a[7]);                   //output will be -8
		System.out.println(a[9]);                   //output will be -10
		System.out.println(b[2]);                   //output will be -kallu
		System.out.println(b[0]);                   //output will be -sallu
		
		
		Object c[] = {1,2,3,"anish","meet",'A','f',45>66,6.1};           //prepared Object ARRAY
		System.out.println(c[2]);      // output will be -3              // In Object array we can assign all data types. 
		System.out.println(c[4]);      // output will be -meet
		System.out.println(c[7]);      // output will be -false
		System.out.println(c[8]);      // output will be -6.1
		
	}

}
