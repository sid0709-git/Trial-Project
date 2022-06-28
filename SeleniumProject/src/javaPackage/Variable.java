package javaPackage;

public class Variable {

	public static void main(String[] args) {
		
// int is primitive data type. 'a' is variable and 10 is variable value.
		
		int a = 10;                                     // integer type local variable.
		System.out.println(a);                          // output will be 10
        int b = 20;                                     // integer type local variable.
        System.out.println(b);                          // output will be 20
            b = 30;                                      //reassigned value to 'b'
        System.out.println(b);                           // output will be 30
        
        char c = 'w' ;                            // character type local variable. should be placed inside single quote
        System.out.println(c);                    // output will be w
        
        boolean d = true;                                     // boolean type local variable.
        System.out.println(d);                                // output will be true
        System.out.println(12 > 13);                          // output will be false
        
         int f = 123;                                         // integer type local variable.
         int g = 678;                                         // integer type local variable.
         boolean h = f > g ;                                  // boolean type local variable.
         System.out.println(h);                               // output will be false
       
         
         String s = "Automation Test Engineer" ;              // calculate length of string
        // int lengthOfString = s.length() ;                  // length() method (pre-defined method in java) is used
        // System.out.println(lengthOfString);    //OR
         System.out.println(s.length());                      // another way to calculate length.
                        
	}
}
