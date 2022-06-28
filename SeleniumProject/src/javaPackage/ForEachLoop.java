package javaPackage;

public class ForEachLoop {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 							// defined an integer array
		String c[] = { "moru", "koru", "boru", "dhiru", "bolu", "chalu" }; 		// defined an String array
		char e[] = { 'A', 'D', 'c', 'd' }; 										// defined an char array

		for (int b : a) {
			//for (String d : c) {
				//for (char f : e) {
					System.out.println(b);
					//System.out.println(d);
					//System.out.println(f);

				}

			}
		}
	


//for-ecah loop used to traverse an array.
//syntax is - for(dataType variable:arrayRef)
//There is also a "for-each" loop, which is used exclusively to loop through elements in an array.