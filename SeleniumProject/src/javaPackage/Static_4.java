package javaPackage;

public class Static_4 {

	public static void main(String[] args) {
	                    
	Static_3 s3 = new Static_3(1,"john");		//here we created an object of Static_3 class and pass the value.
	Static_3 s4 = new Static_3(2,"anee");		//here we created an object of Static_3 class and pass the value.
	Static_3 s5 = new Static_3(3,"peter");		//here we created an object of Static_3 class and pass the value.
	
	//Static_3.college= "IIT KANPUR";			   // here we can change college name from Static_3 class by using class constructor.
	//Static_3.city="kanpur city";                 // here we can change city name from Static_3 class by using class constructor.
	
		s3.getResult(); 		// here we called getResult() method from Static_3 class by using  object references
		s4.getResult(); 		// here we called getResult() method from Static_3 class by using  object references
		s5.getResult(); 		// here we called getResult() method from Static_3 class by using  object references.
		
	}

}

//A constructor in Java is a special method that is used to initialize objects. 
//The constructor is called when an object of a class is created. 
//It can be used to set initial values for object attributes.
