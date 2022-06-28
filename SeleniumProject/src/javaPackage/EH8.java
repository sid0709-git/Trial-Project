package javaPackage;

public class EH8 {

	public static void main(String[] args) {
		try {
		int x = 20/2;
		System.out.println(x);
		
		}finally {
			
			try {
				int y = 45/0;
			} catch (Exception e) {
			
				e.printStackTrace();
			}
			System.out.println("finally block exception handled");
		}
		
		
	}

}
