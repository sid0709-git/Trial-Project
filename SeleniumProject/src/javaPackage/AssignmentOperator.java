package javaPackage;

public class AssignmentOperator {

	public static void main(String[] args) {
		int m = 25;
		
		m += 25;
		System.out.println(m);                // output is 50 i.e new value of 'm' = 50 and 
		                                      // it take recent value of 'm' always to perform next operation.
		m -= 5;
		System.out.println(m);                // output is [50-5 = 45] 45 i.e. new value of 'm' = 45     
		
		m *=6;
		System.out.println(m);                // output is [45*6 = 270] 270 i.e.new value of 'm' = 270  
		 
		m /=5;
		System.out.println(m);                // output is [270/5 = 54] 54 i.e. new value of 'm' = 54   so on.....  

	}

}
