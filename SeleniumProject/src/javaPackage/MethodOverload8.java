package javaPackage;

public class MethodOverload8 {
	
	// here same method name but observe at parameters (they are same)

		public void sum(int a, int b) { 							// same  parameters given here 
			System.out.println(a + b);
		}

		public void sum(long a, long b) {							// same parameters given here 
			System.out.println(a + b);
		}

		public static void main(String[] args) { 					// calling main method in same class
			
			MethodOverload8 mo8 = new MethodOverload8();		    // created object in same class
			
			mo8.sum(23, 13); 										// No Ambiguity Issue here [resolved issue here]
		}

	}


