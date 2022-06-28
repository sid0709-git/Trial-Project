package javaPackage;

public class Array_2 {
	public static void main(String[] args) {
		
	//We can define an array in following fashion.
	
	Object a[]= {1,2,3,'A','c',"java","selenium", 12.33, 0.007};           //defining object array
	String g []= {"LIC","SIP","Object","Automation"};                      //defining string array
	int d []= {34,75,93,21,64,2,5,7,8,0};                                  //defining integer array
	
	System.out.println(a[3]);                       //output will be- A
	System.out.println(g[2]);                       //output will be- object
	System.out.println(d[4]);                       //output will be- 64
	System.out.println(a.length);                   //output will be- 9
	System.out.println(g.length);                   //output will be- 4
	System.out.println(d.length);                   //output will be- 10
	
	a[3]='S';                                      // we can modify an array value using index
	g[3]="Programming";                            // we can modify an array value using index
	d[5]=22;                                       // we can modify an array value using index
	System.out.println(a[3]); 
	System.out.println(g[3]);
	System.out.println(d[5]);
	}
}
