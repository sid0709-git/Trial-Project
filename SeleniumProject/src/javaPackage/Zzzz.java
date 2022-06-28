package javaPackage;

public class Zzzz {
	
	//With method overloading, multiple methods can have the same name with different parameters
	
	static int tigre(int x,int y) {   						// passing int 
	    return (x + y);
	}
	static float tigre (float a , float b) { 				// passing float 
		return (a + b);
	}
    static String tigre (String s1,String s2) {				// passing String
    	return (s1+s2);
    }


	public static void main(String[] args) {
		String s1="     hello string ";                         
		System.out.println(s1+"Technolamror");               //without trim()
		System.out.println(s1.trim()+"Technolamror");        //with trim()-using trim method to delete space before hello
		System.out.println(s1.toUpperCase());               // convert string into UPPER CASE
		
		  System.out.println(tigre(3,5));                             //called tigre method with attributes
          System.out.println(tigre(1.1f,3.2f));                       //called tigre method with attributes
          System.out.println(tigre("mahesh ","dinesh"));              //called tigre method with attributes

	}
	
	}

