package javaPackage;

public class Static_3 {
	int roll ;
    String name ;
	static String college="IIT BOMBAY";
	static String city = "Mumbai";
	

	Static_3 (int r,String n){       //Constructors can also take parameters, which is used to initialize attributes.
	                                 //Note that the constructor name must match the class name, 
		                             //and it cannot have a return type (like void).
		
		roll = r;
		name= n;
}
	
	public void getResult() {                                  // created non-static user defined method-getResult()
		System.out.println(roll+" "+name+" "+college+" "+city);
	
}
}
