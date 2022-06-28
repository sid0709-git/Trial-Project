package javaPackage;

public class Static_2 {
	int roll ;             //declaring global variable
	String name ;          //declaring global variable
	String college ;       //declaring global variable
	
	public static void main(String[] args) {
		Static_2 st = new Static_2();                      // created object of Static_2 class
		
		System.out.println(st.roll);       //0            // calling global variable with reference of object
		System.out.println(st.name);      //null          // calling global variable with reference of object
		System.out.println(st.college);   //null          // calling global variable with reference of object
		
		

	}

}
