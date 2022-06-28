package javaPackage;

public class InvertString {

	public static void main(String[] args) {
	
		StringBuffer a = new StringBuffer("java is funny language...isn't it?");
		StringBuffer b = new StringBuffer("siddharam and OM and pooja");
		StringBuffer c = new StringBuffer("VINAYAK AND RAHUL ");
		StringBuffer d = new StringBuffer("Samarth and shubham");
		System.out.println(a.reverse());                          //Using Internal java Method .reverse();
		System.out.println(b.reverse());                          //Using Internal java Method .reverse();
		System.out.println(c.reverse());
		System.out.println(d.reverse());

	}

}
// StringBuffer is a peer class in java used to do operation on string objects such as reverse of string.