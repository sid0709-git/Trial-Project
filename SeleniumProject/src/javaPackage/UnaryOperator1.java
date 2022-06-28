package javaPackage;

public class UnaryOperator1 {

	public static void main(String[] args) {
	
		int x = 1;                                         //local variable
	             
	System.out.println(x++);                               //output-1,2    [post increment]
	
	System.out.println(++x);                               //output-3,3    [pre increment]
	
	System.out.println(--x);                               //output-2,2    [pre decrement]
	
	System.out.println(x--);                               //output-2      [post decrement]      
	
		
		int a = 25;
		int b = 20;
		System.out.println(a++);                   // 25,26            it will print- 25
		System.out.println(a++ + ++a);             // 26,27,28,28      it will print- 54
		System.out.println(a + a++);               // 28,28,29         it will print- 56
		System.out.println(b++ + b--);             // 20,21,21,20      it will  print-41
		System.out.println(b);                     // 20               it will print- 20
		
		
		int p = 2;
		int q = p++;
		System.out.println(p);          // will print - 3 (value increased by 1 i.e. p++ will add in p= 2+1 =3 )
		System.out.println(q);          // will print 2   (first value of p will print i.e.= 2)
		
	}

}