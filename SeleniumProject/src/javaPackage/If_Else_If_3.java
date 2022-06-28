package javaPackage;

public class If_Else_If_3 {                                   //ladder if else statement.
	
	public static void main(String[] args) {
		
     int x = 455;
     int y = 204;
     int z = 321;
     
     if (x == y & y == z){
	     System.out.println("x,y,z are equal");
	     
    } else if (x>y & y>z) {
	     System.out.println("x is greater than y and z");
    }else if (x>z & z>y){
	     System.out.println("y is less than x and z");
    }else {
	     System.out.println(" z is greater than x and y");
}
}
}
