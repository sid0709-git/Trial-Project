package javaPackage;

public class Array_1 {

	public static void main(String[] args) {
		
		int a[]= new int[5];                  //Instantiation of array 
		
		a[0]=2;                               //Initialize an Array
		a[1]=23;
		a[4]=12;
		a[2]=243;
		a[3]=126;
		
System.out.println(a[4]);                                         //output will be 12
		
System.out.println("The length of an array is:- " +a.length);     //To print length of array.(length is property of array)
		
	for(int i = 0; i<a.length; i++) {                            //To print all array elements
			
System.out.println(a[i]);                                       // all value will be printed
			
		}
	}
	}

