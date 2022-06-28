package javaPackage;

public class Array_3 {

	public static void main(String[] args) {
		
		 //Defining Multidimensional Array
	int a[][]= { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9,7,1, 2 }, { 3, 4, 5, 6 }, { 1, 2, 4, 5 } };    
	
	System.out.println("Total no.of rows: "+ a.length);                 // calculate no.of rows
	System.out.println("Total no. of columns: "+a[0].length);          // calculate no.of columns
		
         //Print all data from multidimensional array

	for(int i = 0 ; i<a.length; i++){ 				     //outer loop
		
		for(int j=0; j<a[0].length; j++) { 				// inner loop
			
			System.out.print(a[i][j] +"  ");
		}
			System.out.println();                     // to bring cursor in next line we used println()method.
			
		}
	}
	
	}


