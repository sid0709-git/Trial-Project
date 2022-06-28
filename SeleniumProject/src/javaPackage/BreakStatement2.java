package javaPackage;

public class BreakStatement2 {

	public static void main(String[] args) {
		
		for(int i=1;i<3;i++) {                        // outer loop- 
		                                               
			for(int j=1;j<3;j++) {                    // inner loop 
				
	//[inner loop will execute till condition is satisfied then it will go to outer loop if not satisfying condition]
	//refer this you tube video- 'https://www.youtube.com/watch?v=v2_KBe1pD_w'
				
				if(i==2 && j==2) {
					
					break;
					
				}
				System.out.println(i+ "  " +j);  //1,1     1,2       2,1
		}

	}

	}
}
