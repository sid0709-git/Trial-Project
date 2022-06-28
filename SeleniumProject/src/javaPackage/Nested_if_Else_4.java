   package javaPackage;

     public class Nested_if_Else_4{
	
	     public static void main(String[] args) {
	    	int age  = 15;
		    int weight = 70;
		
	   if(age>18) {                                            //outer if
		    	
			 if (weight>50 ) {                              //Inner if (it will execute only if the outer if block is true.)
		        System.out.println("Rahul is eligible for blood donation");
		
			} else {
				System.out.println("Rahul  is not eligible");
			}
			
			}else{
				System.out.println("age should be grater than 18");
			}
		}
		
	}


